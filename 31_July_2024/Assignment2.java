import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int marks=sc.nextInt();
	    if(marks<25){
	        System.out.println("Corresponding grade is: " +"F");
	    }
	    else if(marks>=25 && marks<45){
	        System.out.println("Corresponding grade is: " +"E");
	    }
	    else if(marks>=45 && marks<50){
	        System.out.println("Corresponding grade is: " +"D");
	    }
	    else if(marks>=50 && marks<60){
	        System.out.println("Corresponding grade is: " +"C");
	    }
	    else if(marks>=60 && marks<80){
	        System.out.println("Corresponding grade is: " +"B");
	    }
	    else if(marks>=80){
	        System.out.println("Corresponding grade is: " +"A");
	    }
	}
}
