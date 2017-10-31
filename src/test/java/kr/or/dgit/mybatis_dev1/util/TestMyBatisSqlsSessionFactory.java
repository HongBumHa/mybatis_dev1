package kr.or.dgit.mybatis_dev1.util;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMyBatisSqlsSessionFactory {
	private static SqlSessionFactory factory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		factory = MyBatisSqlSessionFactory.getSqlSeesionFactory();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws  Exception{
		factory = null;
	}
	@Test
	public void testASqlSessionFactory() {
		factory = MyBatisSqlSessionFactory.getSqlSeesionFactory();
		Assert.assertNotNull(factory);
	}
	
	@Test
	public void testBOpenSession() {
		
		Connection con = factory.openSession().getConnection();
		System.out.println("aaaaa"+con);
		Assert.assertNotNull(con);
	}
}
