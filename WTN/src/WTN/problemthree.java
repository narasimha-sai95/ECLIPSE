package WTN;
class Patient
{
	String patientName;
	double height,weight;
	Patient(String patientName,double height,double weight)
	{
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;
	}
	double computeBMI()
	{
		double a=height*height;
		return weight/a;
	}
	
}
public class problemthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient("Sam",1.9,57.6);
		System.out.println("BMI of the patient: "+p.computeBMI());
		
		
		
	}

}
