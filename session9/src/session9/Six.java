package session9;
class Five implements Four,Three,Two,One
{
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Addition of two numbers="+c);
	}
	public void sub(int a,int b) {
		int c=a+b;
		System.out.println("Subtraction two="+c);
	}
	public void mul(int a,int b) {
		int c=a*b;
		System.out.println("Multiplication of two="+c);
	}
	public void div(int a,int b) {
		int c=a/b;
		System.out.println("Division of two="+c);
	}
	
}

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Five f=new Five();
		f.add(20, 30);
		f.sub(30,10);
		f.mul(20, 20);
		f.div(5, 5);
		
	}

}
