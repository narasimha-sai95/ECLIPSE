package session9;
class D implements C
{
	public void print() 
	{
		System.out.println("A interface method");
	}
	public void display()
	{
		System.out.println("B interface method");
	}
	public void show()
	{
		System.out.println("C interface method");
	}
}




public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D ob=new D();
		ob.print();
		ob.display();
		ob.show();

	}
}