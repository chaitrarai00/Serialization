package com.model;

import java.io.Serializable;

public class Demi implements Serializable{
	@Override
	public String toString() {
		return "Demi [id=" + id + ", name=" + name + ", ignore=" + ignore + ", common"+common+"]";
	}

	private static final long serailversionuid=123456789L;
	private int id=1;
	private String name="demi";
	private transient int ignore;
	private static int common;
	
	public Demi(int id, String name, int ignore, int common) {
		this.id=id;
		this.name=name;
		this.ignore=ignore;
		this.common=common;
	}
}
