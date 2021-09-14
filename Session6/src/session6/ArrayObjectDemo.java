package session6;
class Employee
{
	String name;
	double salary;
	Employee(String n,double s)
	{
		name=n;
		salary=s;
	}
	void display()
	{
		System.out.println("Name: "+name+""+" Salary: "+salary);
	}
}
public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp[]=new Employee[4];
		emp[0]=new Employee("ramesh",3000.00);
		emp[1]=new Employee("suresh",4000.00);
		emp[2]=new Employee("lokesh",7000.00);
		emp[3]=new Employee("akhil",8000.00);
		for(int i=0;i<4;i++) {
			emp[i].display();
		}
	}

}
