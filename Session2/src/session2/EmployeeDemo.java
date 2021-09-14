package session2;
class Employee{
	//instance variables
	int id;
	String name;
	int salary;
	//constructer doesnt have retuen tupe
	Employee(int id,String name,int salary)//Employee is the paramaterised constructor
	{
		this.id=id;//left id instance & right local variable
		//this is reference varaible
		this.name=name;
		this.salary=salary;
		//if not using this key word it provides default value of datatype
		
	}
	void display()//display is a instance method
	//method can return a value
	{
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee salary:"+salary);
		
		//System.out.println(id+""+name+""+"Salary is"+salary);
	}
}


public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(101,"suresh",30000);
		e1.display();
		Employee e2=new Employee(102,"ramesh",40000);
		e2.display();
	}

}
