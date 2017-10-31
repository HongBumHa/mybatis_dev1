package kr.or.dgit.mybatis_dev1.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	private static SqlSessionFactory sqlSeesionFactory;

	public static SqlSessionFactory getSqlSeesionFactory() {
		if(sqlSeesionFactory ==null) {
			try(InputStream is = Resources.getResourceAsStream("mybatis-config.xml")){
				sqlSeesionFactory = new SqlSessionFactoryBuilder().build(is);
				
			}catch(IOException e) {
				throw new RuntimeException(e.getCause());
			}
		}
		return sqlSeesionFactory;
	}
	
}
