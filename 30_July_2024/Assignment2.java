

import java.util.*;

class shubham1{
                 static void add(int x,int y){
                       System.out.println(x+y);
                  }
                  static void mul(int x,int y){
                       System.out.println(x*y);
                  }
                  static void div(int x,int y){
                       System.out.println(x/y);
                  }
                  static void sub(int x,int y){
                       System.out.println(x-y);
                  }
}

class Assignment2{        
           public static void main(String[] args){
                  Scanner sc=new Scanner(System.in);
                  int a=sc.nextInt();
                  int b=sc.nextInt();
                  shubham1.add(a,b);
                  shubham1.sub(a,b);
                  shubham1.mul(a,b);
                  shubham1.div(a,b);
}
}