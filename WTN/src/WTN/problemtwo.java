package WTN;
class Calculator
{
	static int powerInt(int a,int b)
	{
		return (int)Math.pow(a, b);
	}
	static double powerDouble(double a,double b)
	{
		return Math.pow(a,b);
	}
}
public class problemtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The power of int num1 to int num2 :"+Calculator.powerInt(2,15)); 

		System.out.println("The power of double num1 to double num2 :"+Calculator.powerDouble(2.9,15.8)); 
	}

}
