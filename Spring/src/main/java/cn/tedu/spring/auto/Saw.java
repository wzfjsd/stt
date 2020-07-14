package cn.tedu.spring.auto;

import java.io.Serializable;

public class Saw implements Too, Serializable {
	private String name = "¸«Í·";

	@Override
	public String toString() {
		return name;
	}

}
