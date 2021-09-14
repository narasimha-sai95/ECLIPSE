package session4;
class A1{
	void m1()
	{
	    System.out.println("M1 method in super class");	
	}
}
class B1 extends A1
{
	void m1()
	{
		System.out.println("M1 method in sub class");
	}
}
class C1 extends B1
{
	void m1()
	{
		System.out.println("M1 method in sub sub class");
	}
}

//here we cannot retreive class C 's method
//as it is inherited from B
//Class A can be retrieve from using super.m1() in class B's m1(); method
//Class c WE CAN'T retrieve
//THERE DYNAMIC METHOD DISPATCH

//with out using the super keyword we can retrieve all classes


public class Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A1 a=new A1();//super class A
			B1 b=new B1();
			C1 c=new C1();
			A1 ref;//refrence of super class ,it is not object
			ref=a;//value of object a is stored in ref
			ref.m1();
			ref=b;
			ref.m1();
			ref=c;
			ref.m1();
			//if ref=a;
			//ref.m1();
			//ref.m1();
			//ref.m1();   now it prints class A method only
			//because a is only refered 
			//if ref=b; then we can retreive Class B's method
	}

}
