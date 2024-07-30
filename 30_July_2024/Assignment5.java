/*
Write a program to search for the greatest of three numbers using Short-circuit Operators and print the result. 
*/


import java.util.*;

class Assignment5{
                  
            public static void main(String[] args){
                  int a=10;
                  int b=10;
                  int c=9;
                  if(a>=b && a>=c){
                     System.out.println("greatest number is :" +a);
                  }
                  else if(b>=a && b>=c){
                     System.out.println("greatest number is :" +a);
                  }
                  else if(a==b && b==c){
                     System.out.println("All numbers are equal");
                  }
                  else{
                     System.out.println("Greatest number is :" +c);
                  }
}
}