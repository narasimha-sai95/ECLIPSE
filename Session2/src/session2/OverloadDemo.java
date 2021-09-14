package session2;
class Overload{
	void add() 
	{
		System.out.println("No parameters");
	}
	void add(int a) 
	{
		System.out.println("a="+a);
	}
	int add(int a,int b)//a,b,c are local variables
	{
		int c=a+b;
		//System.out.println("sum="+c);
		//if we use int,float,double method we can use return statement directly
		return c;
	}
	float add(float a,float b)
	{
		float d=a+b;
		//System.out.println("sum="+d);
		return d;
	}
	double add(double a,double b)
	{
		double e=a+b;
		//System.out.println("sum="+e);
		return e;
	}
}
public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload ob =new Overload();
		ob.add();
		ob.add(20);
		int x=ob.add(30,40);
		System.out.println(x);
		float y=ob.add(30.0f,40.0f);
		System.out.println(y);
		double z=ob.add(20.0,30.0);
		System.out.println(z);
	}

}
