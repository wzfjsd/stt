package cn.tedu.spring;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * LogWriter ��һ����־�����, ʹ��ʱ
 * ���봴�������Ժ�, ������open��������־�ļ�
 * ʹ���ڼ�, ���Զ��ʹ�� log������¼��Ϣ
 * ʹ���Ժ�Ҫ���� close() �ر��ļ�
 * 
 * LogWriter logger = new LogWriter();
 * logger.open(); //��ʼ������
 * logger.log("Hello World!");
 * logger.log("���������?");
 * logger.close(); //��Դ���շ���
 */
public class LogWriter {
	private PrintWriter out;//null
	public void open() throws IOException {
		out = new PrintWriter("demo.log");
		System.out.println("Open File");
	}
	public void close() {
		out.close();
		System.out.println("Close File");
	}
	public void log(String msg) {
		out.println(msg);
		out.flush();
		System.out.println("Append:"+msg);
	}
}



