package main;

public class Student implements Person {
	String name;
	private Bell bell;


	public Bell getBell() {
		return bell;
	}
	public void setBell(Bell bell) {
		this.bell = bell;
	}
	@Override
	public String makeAction() {
return "I'm  a student : "+name+" "+bell.getName();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
