package cn.tedu.spring.DI;

import java.io.Serializable;

public class Worker  implements Serializable{
	private String name="��ͷǿ";
	private Saw saw ;
	
	public void setName(String name) {
		this.name = name;
		System.out.println("ע��:"+name); 
	}
	
	public void setSaw(Saw saw) {
		this.saw = saw;
		System.out.println("ע��:"+saw); 
	}
	public void work() {
		System.out.println(name+"ʹ��"+
				saw+"����");
	}
	@Override
	public String toString() {
		return name;
	}
	
}
