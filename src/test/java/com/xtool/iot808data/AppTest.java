package com.xtool.iot808data;

//import java.io.Console;
//import java.lang.reflect.Field;
//import java.util.List;

//import javax.naming.directory.SearchResult;

//import org.springframework.data.mongodb.core.MongoTemplate;

//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
//import com.xtool.enterprise.data.ComparePatterns;
//import com.xtool.enterprise.data.DataSearchResult;
//import com.xtool.enterprise.data.FieldCondition;
//import com.xtool.iot808data.device.deviceCondition;
//import com.xtool.iot808data.device.deviceMaintainer;
//import com.xtool.iot808data.device.deviceModel;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	/*Field[] fields=deviceCondition.class.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			field.setAccessible(true);
		String tString=	field.getType().toString();
		String ttString=field.getGenericType().toString();
		
		String ptype="";
		if(ttString.startsWith(MongoQueryParser.TYPE_FLAG))
			ptype=ttString.substring(MongoQueryParser.TYPE_FLAG.length(), ttString.length()-1);
		
		System.out.println(tString+"-->"+ttString+"-->"+ptype);
		}
		System.out.println(String.class.getName());*/
        assertTrue( true );
    }
    /*
    public void testMongoSearch() {
		deviceMaintainer maintainer=new deviceMaintainer();
		maintainer.mongoTemplate=new MongoTemplate(new MongoClient("19.87.22.3",27017), "p808");
		deviceCondition condition=new deviceCondition();
		//condition.sno=new FieldCondition<String>();
		//condition.sno.field="sno";
		//condition.sno.values=new String[] {"013715129383"};
		//condition.sno.comparePattern=ComparePatterns.EQ;
		DataSearchResult<deviceModel> result=maintainer.search(condition);
		System.out.println(result.total);
		assertTrue(result.total>0);
	}*/
}
