package search;
import java.util.*;
public class binarySearch {
	
	public static int binsearch(int[] Arr,int srch) {
		int start=0;
		int end=Arr.length -1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(Arr[mid]==srch) {
				return mid;
			}else if(mid>srch) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String ...args) {
		int[] Arr = new int[]{1,2,3,4,5,6,7,8,9,22}; 
		int srch=9;
		int res=binsearch(Arr,srch);
		System.out.println("The Result is found at index: "+res);
		if(res==-1) {
			System.out.println("The Result is Not found");
		}
	}

}
