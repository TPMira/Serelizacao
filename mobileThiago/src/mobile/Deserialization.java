package mobile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) {
		
		Horario object1 = null;
		
		String filename = "file.ser";
	
	try {
		FileInputStream file = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(file);
		
		object1 = (Horario) in.readObject();
		
		in.close();
		file.close();
		
		System.out.println("Object  has been deserialized");
		
		System.out.println(object1);
		
		}
	catch(IOException ex) {
		System.out.println("IOException is caught");
	}
	catch(ClassNotFoundException ex) {
		System.out.println("ClassNotFoundException is caught");
	}
	}
}
	


