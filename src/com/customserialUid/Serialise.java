package com.customserialUid;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.model.Demi;

public class Serialise {
	public static void main(String[] args) {
	Demi object_1=new Demi(1, "iwish",300,20);
	String filename="file.ser";
	try {
		FileOutputStream file=new FileOutputStream(filename);
		ObjectOutputStream out=new ObjectOutputStream(file);
		out.writeObject(object_1);
		out.close();
		file.close();
		System.out.println("Object serialized");
		System.out.println(object_1);
		//System.out.println(object_1.toString());
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	try {
		FileInputStream file=new FileInputStream(filename);
		ObjectInputStream in=new ObjectInputStream(file);
		Demi object_2=(Demi)in.readObject();
		in.close();
		file.close();
		System.out.println("Object deserialized");
		System.out.println(object_2);
		//System.out.println(object_2.toString());
	}
	catch (IOException|ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
