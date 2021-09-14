package WTN;
class Book 
{
	String bname;
	double price;
	int qtyinStock;
	Book(String bname,double price,int qtyinStock)
	{
		this.bname=bname;
		this.price=price;
		this.qtyinStock=qtyinStock;
		
	}
	
}
class Author extends Book
{
	String name,email;
	char gender;
	Author(String bname,double price,int qtyinStock,String name,String email,char gender)
	{
		super(bname,price,qtyinStock);
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	void display() {
	System.out.println("Book Name : "+bname);
	System.out.println("Price of the Book : "+price);
	System.out.println("Quantity Available in Stock : "+qtyinStock);
	System.out.println("Author Name : "+name);
	System.out.println("E-mail : "+email);
	System.out.println("Gender: "+gender);
	}
}
public class problemfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author("Umbrella Academy",582.56,100,"Gerard Way","GerardWay@gmail.com",'M');
		a.display();
	
	}

}
