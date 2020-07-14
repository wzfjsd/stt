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

public class TestCase02 {

	ClassPathXmlApplicationContext cxc;

	@Before
	public void init() {
		cxc = new ClassPathXmlApplicationContext("beans2.xml");
	}

	@After
	public void destroy() {
		cxc.close();
	}

	@Test
	public void testWorker() {
		/*
		 * 测试松耦合关系
		 */
		cn.tedu.spring.auto.Worker worker =
				cxc.getBean("worker", cn.tedu.spring.auto.Worker.class);
		worker.work();
	}
	
	@Test
	public void testByname() {
		/*
		 * 测试 按照名字自动注入
		 */
		cn.tedu.spring.auto.Worker worker =
				cxc.getBean("byName", cn.tedu.spring.auto.Worker.class);
		worker.work();
	}
	
	@Test
	public void testBytype() {
		/*
		 * 测试 按照类型自动注入
		 */
		cn.tedu.spring.auto.Worker worker =
				cxc.getBean("byType", cn.tedu.spring.auto.Worker.class);
		worker.work();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
