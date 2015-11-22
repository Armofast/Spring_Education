package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bell {
	@Value("Vasya")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}
}
