import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int total_class=sc.nextInt();
	    int attended=sc.nextInt();
	    int percentage=(attended * 100)/total_class;
	    System.out.println("enter Y if have medical reason else enter N");
	    String ch=sc.next();
	    String y="Y";
	    if(y==ch){
	        System.out.println("you are allowed");
	    }
	    else if(percentage>=75){
	        System.out.println("you are allowed");
	    }
	    else{
	        System.out.println("you are Not allowed");
	    }
	    
	}
}
