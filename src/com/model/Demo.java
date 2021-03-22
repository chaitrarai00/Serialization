package com.model;

import java.io.Serializable;

public class Demo implements Serializable{
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + "]";
	}

	private int id;
	private String name;
	
	public Demo(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
