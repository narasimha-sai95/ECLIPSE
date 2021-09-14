package session2;
//here all static blocks will be combined(considered) as one bloack by JVM
public class StaticExample {

		// TODO Auto-generated method stub
		StaticExample()
		{
			System.out.println("This is constructor");	
		}
		static
		{
			System.out.println("This is static block 3");
		}
		static void show()
		{
		System.out.println("This is static method");
		}
		static
		{
			System.out.println("This is static block 1");
			
		}


		public static void main(String[] args) {
			System.out.println("This is main method");
			StaticExample se=new StaticExample();
			
			StaticExample.show();
		}
		static
		{
			System.out.println("This is static block 2");
		}
		

}
