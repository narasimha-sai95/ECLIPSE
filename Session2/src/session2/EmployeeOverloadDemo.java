package session2;
//single class contains one or more constructors is called constructor overloading
//constructor may be paramatrised or not
//constructor can be overload aand cannot override
//method can be overloaded and overrided

class Employee1//class name and constructor name is same
{
	int idn;
	String n;
	int s;
	Employee1(){//default constructor
		System.out.println("Default constructor");
	}
	Employee1(int idn,String name){//parameterised constructor
		this.idn=idn;
		this.n=name;
		
	}
	Employee1(int id,String name,int salary){
		this.idn=id;
		this.n=name;
		this.s=salary;
		
	}
	void display() {
		System.out.println("Employee id:"+idn);
		System.out.println("Employee name:"+n);
		System.out.println("Employee salary:"+s);
	}
}


public class EmployeeOverloadDemo {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();//e1 belongs to first constructor
		e1.display();
		Employee1 e2=new Employee1(102,"suresh");//second constructor is parameterised constructor
		e2.display();//it has only two parameters so third value will be default value of datatype
		Employee1 e3=new Employee1(103,"ramesh",20000);//now it has all three parameters
		e3.display();
		

	}

}
