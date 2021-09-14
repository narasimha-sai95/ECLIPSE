package session4;
//METHOD OVERLOADING USING STATIC METHODS
//if there are two methods overloaded
//if there are same arguments to above two methods
//we have to change the arguments
//no of arguments are same then change arguments in next method

public class TestOverloadDemo {
	
	public static int max(int n1,int n2)//static method with int argumnet
	{
		if(n1>n2) {
			return n1;
		}
		else {
			return n2;
		}
	}
	public static double max(double n1,double n2)//static method same argunments(i.e two parameters) so change the datatype
	{
		if(n1>n2) {
			return n1;
		}
		else {
			return n2;
		}
	}
	public static double max(double n1,double n2,double n3)
	{
		return max(max(n1,n2),n3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("The maximum of 3 and 4: "+max(3,4));
	System.out.println("The maximum of 4.0 and 5.0: "+max(4.0,5.0));
	System.out.println("The maximum of 4.5,5.6 and 6.7 : "+max(4.5,5.6,6.7));
		
		
		
	}

}
