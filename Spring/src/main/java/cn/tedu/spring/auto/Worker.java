package cn.tedu.spring.auto;

public class Worker {
	private String name="��ľ����"; 
	private Too too;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Too getToo() {
		return too;
	}
	public void setToo(Too too) {
		this.too = too;
	}
	public void work() {
		System.out.println(name+"ʹ��"+
				too+"����");
	}
	
	
}
