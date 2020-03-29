package commons;
/**
 * 负责读取配置文件，创建执行对象，关闭执行对象
 * @author Effort
 *
 */

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	
	
	private static SqlSessionFactory fac;
	static {
		//1、获取核心配置文件
		try {
			InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
			fac=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static SqlSession createSqlSession() {
		SqlSession sqlSession=fac.openSession(false);
		return sqlSession;
	}
	
	
	//创建一个关闭SQLSession对象方法
	public static void  closeSqlSession(SqlSession sqlSession) {
		if( sqlSession!=null) {
			
			sqlSession.close();
		}
	}
	
	
	
	
	
	
}
