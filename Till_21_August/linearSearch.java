package search;

public class linearSearch {
	
	public static void main(String ...args) {
	int[] Arr = new int[]{ 1,2,3,4,5,6,7,8,9,22 }; 
	for(int i=0;i<10;i++) {
		if(Arr[i]==22) {
			System.out.println("The number is found at index: "+i);
		}
	}
	}

}
