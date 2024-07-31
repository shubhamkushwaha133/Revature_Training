import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int sum=0;
	   for(int i=0;i<10;i++){
	       int x=sc.nextInt();
	       sum +=x;
	   }
	   float average=sum/10.0f;
	   System.out.println("average of ten numbers is: " +average);
	}
}
