package session2;
//static variable may change but constant variable cannot be change at any extent
//staic method can access only static variables where as instance can acess instance variables and static also
class Student
{
	int id;
	String name;
	int imarks;
	static String college="klu";
	Student(int id,String name,int imarks)
	{
		this.id=id;
		this.name=name;
		this.imarks=imarks;	
	}

	void display() 
	{
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("Student internal marks:"+imarks);
		System.out.println("Student name of college:"+college);
		
	}
	//static variable can only changed in static block only
	
	static
	{
		college="k l university";
	}

}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(180030334,"NarasimhaSai",47);
		s.display();

	}

}
