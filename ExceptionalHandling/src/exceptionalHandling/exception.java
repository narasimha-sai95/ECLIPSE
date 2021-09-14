package exceptionalHandling;

public class exception {

	public static void main(String[] args) {
		int i=9;
		String name=null;
		try
		{
			System.out.println(name.length());
			
		System.out.println(i/0);
		
		
		}
		catch(ArithmeticException  | NullPointerException e) {
			System.out.println("Errorrr......");
			
			System.out.println("Bye");

		}
		finally {
			System.out.println("Finally");
		}
		
		
	}

}
