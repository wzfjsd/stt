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
	@Test //�������޲���,�޷���ֵ,���з���
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
		 * Ĭ������� Spring ���յ�������������
		 * ��ε���getBean���ص���ͬһ�����������
		 */
		DemoBean b1 = cxc.getBean("demo",
				DemoBean.class);
		DemoBean b2 = cxc.getBean("demo",
				DemoBean.class);
		//���b1��b2���õ���ͬһ������
		//��b1==b2���Ϊtrue
		System.out.println(b1==b2); 
	}
	
	@Test
	public void testPrototype() {
		/*
		 * Ĭ������� Spring ���յ�������������
		 * ��ε���getBean���ص���ͬһ�����������
		 */
		DemoBean b1 = cxc.getBean("demo1",
				DemoBean.class);
		DemoBean b2 = cxc.getBean("demo1",
				DemoBean.class);
		//���b1��b2���õ���ͬһ������
		//��b1==b2���Ϊtrue
		System.out.println(b1==b2); 
	}
	
	@Test 
	public void testLogger() {
		/*
		 * ���� Spring �Զ����ö�����������ڹ�����
		 */
		LogWriter logger=cxc.getBean(
				"logger", LogWriter.class);
		logger.log("Hello World!");
		logger.log("�����������?");
		logger.log("�ؼҳ�ȥ��!");
	}
	
	
	
	
}
