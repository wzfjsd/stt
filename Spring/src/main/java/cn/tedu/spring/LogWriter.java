package cn.tedu.spring;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * LogWriter 是一个日志输出类, 使用时
 * 必须创建对象以后, 调用其open方法打开日志文件
 * 使用期间, 可以多次使用 log方法记录信息
 * 使用以后要调用 close() 关闭文件
 * 
 * LogWriter logger = new LogWriter();
 * logger.open(); //初始化方法
 * logger.log("Hello World!");
 * logger.log("今天吃了吗?");
 * logger.close(); //资源回收方法
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



