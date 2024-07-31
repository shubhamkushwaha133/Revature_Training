import java.util.*;



class Assignment11{
                 
           public static void main(String[] args){
                      int  number1 = Integer.valueOf(args[0]);
                      int  number2 = Integer.valueOf(args[1]);
                      int area=number1 * number2;
                      int perimeter=2*(number1 + number2);
                      System.out.println(area);
                      System.out.println(perimeter);
} 
}