package com.defaultserialUid;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.model.Demo;

public class Serialise {

	public static void main(String[] args) {
		Demo object_1=new Demo(1, "iwish");
		String filename="file.ser";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(object_1);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized");
		}catch (ClassNotFoundException|IOException e) {
			e.printStackTrace();
		}
	}

}
