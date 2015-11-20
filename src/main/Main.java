package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
Person person=(Person)ac.getBean("person");
System.out.println(person.makeAction());
	}

}
