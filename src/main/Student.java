package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Student implements Person {
	@Value("Alex zahv")
	String name;
	@Autowired
	private Bell bell;

	public Bell getBell() {
		return bell;
	}

	public void setBell(Bell bell) {
		this.bell = bell;
	}

	@Override
	public String makeAction() {
		return "I'm  a student : " + name + " " + bell.getName();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
