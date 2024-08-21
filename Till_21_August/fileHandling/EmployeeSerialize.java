package com.revature.files.serial;
import java. io. FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EmployeeSerialize {
public static void main(String[] args) {

      //FileInputStream fis=null;
      FileOutputStream fos=null;
      ObjectOutputStream oos;
      //ObjectInputStream ois;
      Employee emp=null;
      try {
    	  fos =new FileOutputStream("C:\\Users\\ASUS\\eclipse-workspace\\fileHandling\\Employee.dat");
    	  oos=new ObjectOutputStream(fos);
    	  emp=new Employee(101, "Jasdhir", "Trainer");
    	  oos.writeObject(emp); 
      } catch (IOException e) {
    	  // TODO Auto-generated catch block
    	  e.printStackTrace();
    	  }
      FileInputStream fis=null;
      ObjectInputStream ois=null;
      Employee fromFileEmployee=null;
      try {
      fis=new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\fileHandling\\Employee.dat");
      ois=new ObjectInputStream(fis);
      fromFileEmployee=(Employee) ois.readObject();
      System.out.println(fromFileEmployee);
      } catch (ClassNotFoundException |FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      }catch (IOException e) {
    	  // TODO Auto-generated catch block
    	  e.printStackTrace();
    	  }
}
}