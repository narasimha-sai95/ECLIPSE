package session1v;

class Student{
	int id;
	String name;
	int marks;
	void setDetails(int id,String name,int marks) 
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void display() 
	{
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("Student marks:"+marks);
	}
}
public class StudentDemo {
	public static void main(String args[]) {
	Student s6=new Student();
	s6.setDetails(101,"suresh",40);
	s6.display();

}
}