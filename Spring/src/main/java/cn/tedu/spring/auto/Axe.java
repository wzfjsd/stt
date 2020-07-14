package cn.tedu.spring.auto;

import java.io.Serializable;

public class Axe implements Too,Serializable{
	private String name="µç¾â";

	@Override
	public String toString() {
		return name;
	}
	
}
