package mobile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializacao {
	
	public static void main(String[] args) {
		Horario object = new Horario( 20, 10, 30);
				
		String filename = "file.ser";
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");
			}
		catch(IOException ex) {
			
			System.out.println("IOException is caught");
		}	
	}
}
