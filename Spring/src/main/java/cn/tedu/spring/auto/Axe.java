package cn.tedu.spring.auto;

import java.io.Serializable;

public class Axe implements Too,Serializable{
	private String name="���";

	@Override
	public String toString() {
		return name;
	}
	
}
