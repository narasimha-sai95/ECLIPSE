//Runnable Interface Threads
package threads;
class Hii implements Runnable{
	public void run()//run is internal mehod of thread
		{for(int i=1;i<=5;i++) {
			System.out.println("Hii");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
class Helloo implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Helloo");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
	Hii ob=new Hii();
	Helloo ob2=new Helloo();
	
	Thread t1=new Thread(ob);
	Thread t2=new Thread(ob2);
	
    t1.start();
	try{Thread.sleep(10);} catch(Exception e) {}
	t2.start();
	

	}

}
