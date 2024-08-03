package august1;

//Create a custom exception class that overrides the getMessage( ) method


public class Assignment3 extends Exception {
    // Constructor 
    public Assignment3(String message) {
        super(message);
    }
    // Override the getMessage() 
    @Override
    public String getMessage() {
        return "Custom Exception: " + super.getMessage();
    }
    public static void main(String[] args) {
        try {
            throw new Assignment3("This is a custom exception message");
        } catch (Assignment3 e) {

            System.out.println(e.getMessage());
        }
    }
}

