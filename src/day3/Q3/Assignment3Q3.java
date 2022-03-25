package day3.Q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Assignment3Q3 {

	public static void main(String[] args) {

		Address address=new Address("A21, Preet vihar", "delhi", "India");
		Employee employee=
				new Employee(121, "raj", address, 400000);
		
		
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("temp.ser")));
			oos.writeObject(employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		employee=null;
		try {
			ObjectInputStream oos=new ObjectInputStream(new FileInputStream(new File("temp.ser")));
			employee=(Employee) oos.readObject();
			System.out.println(employee);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}







