package one;
class AB
{
	int a,b;
	String name;
	AB(int a,int b,String name)
	{
		this.a=a;
		this.b=b;
		this.name=name;
	}
}
class DE extends AB
{
	int p,q;
	DE(int a,int b,int p,int q,String name)
	{
		super(a,b,name);
		this.p=p;
		this.q=q;
	}
	void display()
	{
		System.out.println(p);
	}
}
public class abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DE ob=new DE(1,2,3,4,"sai");
		ob.display();
	}

}
