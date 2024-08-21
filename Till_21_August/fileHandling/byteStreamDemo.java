package com.revature.files.bytes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteStreamDemo {
	public static void main(String ... args) {
	FileInputStream input;
	FileOutputStream output;
	try {
	input=new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\fileHandling\\hello.txt"); 
	int c;
	while((c=input.read()) !=- 1)
	System.out.println(c);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

	}

}
}