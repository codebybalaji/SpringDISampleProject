package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * we use scope and value as prototype @scope(value= "prototype")
 */
@Component
public class Aliennn {
	private int aid;
	private String anmae;
	@Autowired // Search for the Class Type in the Spring container
	@Qualifier("lap1") // Search for the name in the Spring container
	private Laptopp laptop;
	
	public void show() {
		System.out.println("inside the show function");
		laptop.complier();
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnmae() {
		return anmae;
	}

	public void setAnmae(String anmae) {
		this.anmae = anmae;
	}
	
}
