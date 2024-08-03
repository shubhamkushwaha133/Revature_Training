package august1;

public class ClassExample {
	public static void main(String[] args) {
		int inputNum=1;
		try {
			inputNum=Integer.parseInt(args[0]);
		}
	    catch(ArrayIndexOutOfBoundsException |NumberFormatException e) {
		e.printStackTrace(); 
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
		}
		int result=17*inputNum;
		System.out.println("Result = "+result);
	}
}
