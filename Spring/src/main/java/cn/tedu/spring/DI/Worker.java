package cn.tedu.spring.DI;

import java.io.Serializable;

public class Worker  implements Serializable{
	private String name="光头强";
	private Saw saw ;
	
	public void setName(String name) {
		this.name = name;
		System.out.println("注入:"+name); 
	}
	
	public void setSaw(Saw saw) {
		this.saw = saw;
		System.out.println("注入:"+saw); 
	}
	public void work() {
		System.out.println(name+"使用"+
				saw+"砍树");
	}
	@Override
	public String toString() {
		return name;
	}
	
}
