import java.util.*;

/*
class Assignment15{
                 
           public static void main(String[] args){
                      Scanner sc=new Scanner(System.in);
                      int  number1 = sc.nextInt();
                      int  number2=sc.nextInt();
                      System.out.println("initial numbers are: " +number1 +" and " +number2);
                      int temp;
                      temp=number2;
                      number2=number1;
                      number1=temp;
                      System.out.println("Swaped numbers are: " +number1 +" and " +number2);

                      
} 
}

*/

class Assignment15{
                 
           public static void main(String[] args){
                      Scanner sc=new Scanner(System.in);
                      int  number1 = sc.nextInt();
                      int  number2=sc.nextInt();
                      System.out.println("initial numbers are: " +number1 +" and " +number2);
                      
                      number1=number1+number2;
                      number2=number1-number2;
                      number1=number1-number2;
                      System.out.println("Swaped numbers are: " +number1 +" and " +number2);

                      
} 
}
