package com.xtool.iot808data;

import java.lang.reflect.Field;
import java.util.List;
import org.bson.BsonNull;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.StringUtils;
import com.xtool.enterprise.data.DataSearchCondition;
import com.xtool.enterprise.data.DataSearchResult;
import com.xtool.enterprise.data.FieldCondition;
import com.xtool.enterprise.data.SortField;

public class MongoQueryParser {

	public static final String TYPE_FLAG="com.xtool.enterprise.data.FieldCondition<";
	
	public static <T,S extends DataSearchCondition> DataSearchResult<T> search(MongoTemplate mongoTemplate,Class<S> conditionClass, S condition, Class<T> entityClass, String collectionName) {
		Query query=MongoQueryParser.toCountQuery(conditionClass, condition);
		long count=mongoTemplate.count(query, collectionName);
		
		query= MongoQueryParser.toQuery(condition, query);
		List<T> data= mongoTemplate.find(query,entityClass, collectionName);
		
		DataSearchResult<T> result=new DataSearchResult<T>();
		result.setData(data);
		result.setPageIndex(condition.getPageIndex());
		result.setPageSize(condition.getPageSize());
		result.setSortFields(condition.getSortFields());
		result.setTotal(count);		
		
		return result;
	}
	public static <T,S extends DataSearchCondition> Query toCountQuery(Class<S> conditionClass,S condition) {
		
		Query query=new Query();
		Field[] fields=conditionClass.getFields();//condition.getClass().getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			field.setAccessible(true);
			String fieldName=field.getName();
			if(
					!fieldName.equals("sortFields") && 
					!fieldName.equals("pageIndex") &&
					!fieldName.equals("pageSize") &&
					!fieldName.equals("total")) {
				Criteria criteria=getFieldCriteria(field, condition);
				if(criteria!=null)
					query.addCriteria(criteria);
			}
		}
		
		return query;
	}
	public static Query toQuery(DataSearchCondition condition,Query query) {
		/*Query query=new Query();
		Field[] fields=condition.getClass().getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			field.setAccessible(true);
			String fieldName=field.getName();
			if(
					!fieldName.equals("SortFields") && 
					!fieldName.equals("PageIndex") &&
					!fieldName.equals("PageSize") &&
					!fieldName.equals("Total")) {
				Criteria criteria=getFieldCriteria(field, condition);
				if(criteria!=null)
					query.addCriteria(criteria);
			}
		}*/
		if(condition.getPageIndex()>0 && condition.getPageSize()>0) {
			query.skip((condition.getPageIndex()-1)*condition.getPageSize()).limit(condition.getPageSize());
		}
		if(condition.getSortFields()!=null && condition.getSortFields().length>0) {
			for (SortField field : condition.getSortFields()) {
				if(field!=null && !StringUtils.isEmpty(field.field) && field.order!=0) {
					query.with(Sort.by(field.order>0? Direction.ASC:Direction.DESC, field.field));
				}
			}
		}
		return query;
	}
	private static Criteria fieldCondition(FieldCondition<?> condition){
		switch (condition.getComparePattern()) {
		case EQ:
			return Criteria.where(condition.getField()).is(condition.getValues()[0]);
		case LT:
			return Criteria.where(condition.getField()).lt(condition.getValues()[0]);
		case GT:
			return Criteria.where(condition.getField()).gt(condition.getValues()[0]);
		case Like:
		case Matchs:
			return Criteria.where(condition.getField()).regex(".*"+condition.getValues()[0].toString()+".*","is");
		case Between:
        {
            // xiabing 修复于 2019/1/4
            // you can't add a second 'xxx' expression 异常
            Criteria criteria = new Criteria();
            criteria.andOperator(Criteria.where(condition.getField()).gte(condition.getValues()[0]),
                                 Criteria.where(condition.getField()).lte(condition.getValues()[1]));
            return criteria;
        }
//			return Criteria.where(condition.getField()).gte(condition.getValues()[0]).and(condition.getField()).lte(condition.getValues()[1]);
		case NotNull:
			return Criteria.where(condition.getField()).ne(BsonNull.VALUE);
		case In:
			return Criteria.where(condition.getField()).in(condition.getValues());
		case IsNull:
			return Criteria.where(condition.getField()).is(BsonNull.VALUE);
		case LE:
			return Criteria.where(condition.getField()).lte(condition.getValues()[0]);
		case GE:
			return Criteria.where(condition.getField()).gte(condition.getValues()[0]);
		case NotIn:
			return Criteria.where(condition.getField()).nin(condition.getValues()[0]);
		case Exists:
			return Criteria.where(condition.getField()).exists(true);
		case NotExists:
			return Criteria.where(condition.getField()).exists(false);
		case Ignore:
		default:
			break;
		}
		return null;
	}
	
	private static <S extends DataSearchCondition> Criteria getFieldCriteria(Field field,S condition) {
		FieldCondition<?> val=null;
		try {
			val = (FieldCondition<?>)field.get(condition);
		} catch (Exception e) {} 
		if(val==null)return null;
		return fieldCondition(val);
	}
	
	/*@SuppressWarnings("unchecked")
	private Criteria getStringFieldCriteria(Field field,DataSearchCondition condition) {
		FieldCondition<String> val=null;
		try {
			val = (FieldCondition<String>)field.get(condition);
		} catch (Exception e) {} 
		if(val==null)return null;
		return fieldCondition(val);
	}
	@SuppressWarnings("unchecked")
	private Criteria getIntegerFieldCriteria(Field field,DataSearchCondition condition) {
		FieldCondition<Integer> val=null;
		try {
			val = (FieldCondition<Integer>)field.get(condition);
		} catch (Exception e) {} 
		if(val==null)return null;
		return fieldCondition(val);
	}
	@SuppressWarnings("unchecked")
	private Criteria getDateFieldCriteria(Field field,DataSearchCondition condition) {
		FieldCondition<Date> val=null;
		try {
			val = (FieldCondition<Date>)field.get(condition);
		} catch (Exception e) {}
		if(val==null)return null;
		return fieldCondition(val);
	}
	@SuppressWarnings("unchecked")
	private Criteria getBooleanFieldCriteria(Field field,DataSearchCondition condition) {
		FieldCondition<Boolean> val=null;
		try {
			val = (FieldCondition<Boolean>)field.get(condition);
		} catch (Exception e) {}
		if(val==null)return null;
		return fieldCondition(val);
	}
	@SuppressWarnings("unchecked")
	private Criteria getFloatFieldCriteria(Field field,DataSearchCondition condition) {
		FieldCondition<Float> val=null;
		try {
			val = (FieldCondition<Float>)field.get(condition);
		} catch (Exception e) {}
		if(val==null)return null;
		return fieldCondition(val);
	}
	@SuppressWarnings("unchecked")
	private Criteria getDoubleFieldCriteria(Field field,DataSearchCondition condition) {
		FieldCondition<Double> val=null;
		try {
			val = (FieldCondition<Double>)field.get(condition);
		} catch (Exception e) {}
		if(val==null)return null;
		return fieldCondition(val);
	}*/
}
