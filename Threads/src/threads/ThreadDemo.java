package threads;
class Hi extends Thread{
	public void run()//run is internal mehod of thread
		{for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
	Hi ob=new Hi();
	Hello ob2=new Hello();
	ob.start();//when ever start is used run is the method of the above class.
	try{Thread.sleep(10);} catch(Exception e) {}
	ob2.start();
	

	}

}
