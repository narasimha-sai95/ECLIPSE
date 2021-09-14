package WTN;
class Box
{
	int w,h,d;
	Box(int w,int h,int d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
	}
	int volume()
	{
		return w*h*d;
	}
	
}
public class problemone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(55,66,57);
		System.out.println("The Volume of the box: "+b.volume());
	}

}
