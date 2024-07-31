import java.util.*;


class Assignment20{
                 
           public static void main(String[] args){
                      Scanner sc=new Scanner(System.in);
                      System.out.println("Enter a three digit number");
                      int num=sc.nextInt();
                      String s1="";
                      while(num>0){
                           int x=num%10;
                           num=num/10;
                           String s=String.valueOf(x);
                           s1 +=s;
                      }
                      System.out.println("Reverse of three digit number is: " +s1);               
} 
}