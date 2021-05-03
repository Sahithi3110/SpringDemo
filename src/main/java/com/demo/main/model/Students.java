package com.demo.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	private int id;
	
	private String name;
	public Students() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
