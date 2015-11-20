package main;

import org.springframework.beans.factory.annotation.Autowired;

public class Professor implements Person{
	@Autowired
private Bell bell;

	public Bell getBell() {
	return bell;
}
public void setBell(Bell bell) {
	this.bell = bell;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
@Override
public String makeAction() {
	return ("I'm professor: "+" "+bell.getName());
	
}
}
