package august1;
import java.util.*;
public class Assignment4 {
	public static void main(String ... args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int num=sc.nextInt();
	int[] arr=new int[num];
	
	for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int maxdiff=0;
	
	for(int i=0;i<num;i++) {
		maxdiff=arr[num-1] - arr[0];
	}
	int mindiff=0;
	for(int i=0;i<num;i++) {
		mindiff=arr[1] - arr[0];
	}
	System.out.println("max diff:" +maxdiff +"min diff:" +mindiff);
	}
}

/*
Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest
*/