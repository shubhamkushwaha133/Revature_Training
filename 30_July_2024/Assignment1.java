package com.revature;
import java.util.*;

class shubham{
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
           public static void main(String[] args){
                  Scanner sc=new Scanner(System.in);
                  int a=sc.nextInt();
                  int b=sc.nextInt();
                  add(a,b);
                  sub(a,b);
                  mul(a,b);
                  div(a,b);
}
}