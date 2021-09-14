package session4;
	//hirarchical inheritance
class Figure
{
	double dim1,dim2;
	Figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	double area()
	{
		return 0;
	}
}
class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);//super class is used in varaible declaration of classB only not any other place
		
	}
	double area()
	{
		return dim1*dim2;
	}
}

class Triangle extends Figure
{
	Triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return dim1*dim2/2;
	}
}
public class FigureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f=new Figure(10.0,20.0);
		Rectangle r=new Rectangle(20.0,30.0);
		Triangle t=new Triangle(30.0,40.0);
		Figure figuref;
		figuref=f;
		System.out.println("Area of figure= "+figuref.area());
		figuref=r;
		System.out.println("Area of Rectangle= "+figuref.area());
		figuref=t;
		System.out.println("Area of Triangle= "+figuref.area());
	
	}
}
