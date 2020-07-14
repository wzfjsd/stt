package day01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.DI.Worker;

public class TestCase01 {
	
	ClassPathXmlApplicationContext cxc;
	@Before
	public void init() {
		cxc=new	ClassPathXmlApplicationContext("beans.xml");
	}
	@After
	public void destroy() {
		cxc.close();
	}
	
	@Test
	public void testQiang() {
		Worker worker=cxc.getBean("qiang",Worker.class);
		worker.work();
	}
	

	@Test
	public void testProperties() {
		/*
		 * 测试: Spring 读取Properties文件 
		 */
		Properties jdbc=cxc.getBean("jdbc",
				Properties.class);
		System.out.println(jdbc); 
	}
	
	
	@Test
	public void testDataSource() {
		/*
		 * 测试Spring管理的连接池对象
		 */
		//BasicDataSource的父类型是DataSource
		DataSource ds = cxc.getBean("ds",
				DataSource.class); 
		String sql="select 'Hello' as s"; 
		
		try(Connection conn=ds.getConnection()){
			Statement st = conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(
						rs.getString("s"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
}
