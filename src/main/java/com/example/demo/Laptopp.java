package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptopp {
	private int lid;
	private String name;
	
	
	
	public int getLid() {
		return lid;
	}



	public void setLid(int lid) {
		this.lid = lid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void complier() {
		System.out.println("compling the process");
	}
}
