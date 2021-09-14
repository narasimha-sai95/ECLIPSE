package session4;
//USING METHOD OVERRIDING PERFORMING RUNTIME POLYMORPHISM
class A{
	int a,b;
	A(int x,int y)
	{
		a=x;
		b=y;
	}
	void show()
	{
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
	}
}

class B extends A//sub class method is ovveridden
{
	int c;
	B(int x,int y,int z)
	{
		super(x,y);
		c=z;
	}
	void show()
	{	 super.show();
	     System.out.println("The value of C is: "+c);	
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B(10,20,30);
		ob.show();// returns sub class's show() method
		
		
		
	}

}
