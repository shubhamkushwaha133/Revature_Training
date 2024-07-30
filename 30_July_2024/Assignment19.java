import java.util.*;


class Assignment19{
                 
           public static void main(String[] args){
                      Scanner sc=new Scanner(System.in);
                      System.out.println("Enter a three digit number");
                      int num=sc.nextInt();
                      int sum=0;
                      while(num>0){
                           int x=num%10;
                           num=num/10;
                           sum +=x;
                      }
                      System.out.println("Sum of the digits of three digit number is: " +sum);               
} 
}