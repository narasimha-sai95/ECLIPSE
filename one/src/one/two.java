package one;
class A{
	//int a;
	//A(int a)
	//{
		//this.a=a;
	//}
	void show(int a)
	{
		System.out.println(a);
	}
}
class B extends A{
//	//int a;
//	B(int a,int b){
//		super(a);
		//this.b=b;
//	}
	void show(int a)
	{
		int b=a*5;
		System.out.println(b);
	}
}
public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		ob.show(4);
		A a=new A();
//		A ref;
//		ref=a;
	a.show(4);
		
	}

}
