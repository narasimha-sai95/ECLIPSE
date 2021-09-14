package session4;
abstract class A3
{
	int a,b;
	A3(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	abstract void sum();
	//abstract method doesnt have any body so end with semicolon
	void mul()
	{
		int c=a*b;
		System.out.println("Multiplication of two numbers= "+c);
		
	}
}
class B3 extends A3
{
	B3(int a,int b)
	{
		super(a,b);
	}
	void sum()
	{
		int c=a+b;
		System.out.println("Sum of two numbers= "+c);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		B3 ob=new B3(10,20);
		//super class is defined in super class
		//and implemented in sub class
		ob.sum();
		ob.mul();
		
	}

}
