package com.revature.files.chars;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class characterStreamDemo {
	public static void main(String ... args) {
		
		FileReader inputReader=null;
		FileWriter outputWriter=null;

		try {
		inputReader=new FileReader("C:\\Users\\ASUS\\eclipse-workspace\\fileHandling\\hello.txt");
		outputWriter=new FileWriter("C:\\Users\\ASUS\\eclipse-workspace\\fileHandling\\hello1.txt");
		int c;
		while((c=inputReader.read()) !=- 1)
		outputWriter.write(c);;
		
		outputWriter.flush();
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}
}
