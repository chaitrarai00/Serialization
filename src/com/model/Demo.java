package com.model;

import java.io.Serializable;

public class Demo implements Serializable{
	private int id;
	private String name;
	
	public Demo(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
