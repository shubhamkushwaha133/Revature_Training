import java.util.*;


class Assignment18{
                 
           public static void main(String[] args){
                      Scanner sc=new Scanner(System.in);
                      System.out.println("Enter a five digit number");
                      int num=sc.nextInt();
                      String s=String.valueOf(num);  
                      char s1=s.charAt(0);
                      char s2=s.charAt(3);
                      int n1=s1 - '0';
                      int n2=s2 - '0';
                      System.out.println("result is : " +(n1 + n2));
                      
                      
} 
}