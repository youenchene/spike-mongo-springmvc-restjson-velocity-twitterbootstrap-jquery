package ys276.core.test.service;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ys276.core.domain.Object1;
import ys276.core.domain.Object2;
import ys276.core.service.ObjectService;
import ys276.core.service.ObjectServiceMongo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:business-spring-context.xml"})
public class TestObjects {
	
	@Autowired
	private ObjectService objectService;
	
	@Autowired
	private ObjectServiceMongo objectServiceMongo;
		
	@Test
	public void TestCreateObject1() throws Exception
	{
		Object1 o1=new Object1();
		o1.setField1("Test2");
		o1.setField2(123);
		o1.setField3(new Date());
		
		objectService.createObject(o1);
		
		Object1 o2=objectService.getObject(o1.getId());
		

		Assert.assertEquals(o1.getId(), o2.getId());
		Assert.assertEquals(o1.getField1(), o2.getField1());
		Assert.assertEquals(o1.getField2(), o2.getField2());
		//Assert.assertEquals(o1.getField3(), o2.getField3());
		
		
	}
	
	@Test
	public void TestCreateObject2() throws Exception
	{
		Object2 o1=new Object2();
		o1.setField1("Test2");
		o1.setField2(123);
		o1.setField3(new Date());
		
		objectServiceMongo.createObject(o1);
		
		Object2 o2=objectServiceMongo.getObject(o1.getId());
		

		Assert.assertEquals(o1.getId(), o2.getId());
		Assert.assertEquals(o1.getField1(), o2.getField1());
		Assert.assertEquals(o1.getField2(), o2.getField2());
		//Assert.assertEquals(o1.getField3(), o2.getField3());
		
		
	}

}
