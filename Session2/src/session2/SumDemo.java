package session2;
class Sum{
	int a,b,c;//instance variables can use entire class but local only upto the class
	void setValues(int x,int y) //local variables of function or method
	{
		a=x;
		b=y;
		c=a+b;
	}
	void display() {
		System.out.println("Sum of two numbers="+c);
	}
}
public class SumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sum s=new Sum();
	//sum() defaultt constructor,new (new heap allocation ,s is object sum is class
	s.setValues(20,30);//call by value
	s.display();
	
	
	}

}
