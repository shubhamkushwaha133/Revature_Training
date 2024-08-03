package august1;
class InvalidAgeException extends Exception{
    public InvalidAgeException (String str)  
    {   
        super(str);  
    }  
}
public class Assignment2{
public void isAllowed(int age) throws InvalidAgeException{
     if(age>18){
        System.out.println("Allowed");
     }else{
        throw new InvalidAgeException("Not allowed");
     }
}

public static void main(String ... args){
       Assignment2 obj=new Assignment2();
       try{
       obj.isAllowed(15);
       }
       catch(InvalidAgeException e){
       System.out.println(e);
       }
}
}
