package day01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.DemoBean;
import cn.tedu.spring.LogWriter;

public class TestCase {
	ClassPathXmlApplicationContext cxc;
	@Before
	public void init() {
		cxc=new ClassPathXmlApplicationContext("beans.xml");
	}
	@After
	public void destroy() {
		cxc.close();
	}
	@Test //必须是无参数,无返回值,公有方法
	public void testHello() {
		System.out.println("Hello World!");
	}
	
	@Test
	public void testKitty() {
		System.out.println("Hello Kitty"); 
	}
	
	@Test
	public void testSingleton() {
		/*
		 * 默认情况下 Spring 按照单例规则管理对象
		 * 多次调用getBean返回的是同一个对象的引用
		 */
		DemoBean b1 = cxc.getBean("demo",
				DemoBean.class);
		DemoBean b2 = cxc.getBean("demo",
				DemoBean.class);
		//如果b1和b2引用的是同一个对象
		//则b1==b2结果为true
		System.out.println(b1==b2); 
	}
	
	@Test
	public void testPrototype() {
		/*
		 * 默认情况下 Spring 按照单例规则管理对象
		 * 多次调用getBean返回的是同一个对象的引用
		 */
		DemoBean b1 = cxc.getBean("demo1",
				DemoBean.class);
		DemoBean b2 = cxc.getBean("demo1",
				DemoBean.class);
		//如果b1和b2引用的是同一个对象
		//则b1==b2结果为true
		System.out.println(b1==b2); 
	}
	
	@Test 
	public void testLogger() {
		/*
		 * 测试 Spring 自动调用对象的生命周期管理方法
		 */
		LogWriter logger=cxc.getBean(
				"logger", LogWriter.class);
		logger.log("Hello World!");
		logger.log("今天你吃了吗?");
		logger.log("回家吃去吧!");
	}
	
	
	
	
}
