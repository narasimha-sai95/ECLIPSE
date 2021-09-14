package session5;

abstract class Figure
{
	double dim1,dim2;
	Figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return dim1*dim2;
	}
}

class Triangle extends Figure
{
	Traingle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return dim1*dim2/2;
	}
}
public class FigureDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
