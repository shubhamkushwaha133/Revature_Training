import java.util.*;

class Assignment14{
                 
           public static void main(String[] args){
                      Scanner sc=new Scanner(System.in);
                      int  number1 = sc.nextInt();
                      int  number2=sc.nextInt();
                      int  number3=sc.nextInt();
                      System.out.println("Total Marks is:" +(number1+number2+number3));
                      float percen = (number1+number2+number3)/3;
                      System.out.println("Percentage Marks is:" +percen +"%");

                      
} 
}