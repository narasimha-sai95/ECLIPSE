package threads;

public class ThreadDemo3 {

	public static void main(String[] args) {
	Runnable ob=() ->{
			for(int i=1;i<=5;i++) {
			System.out.println("Hii");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
			;
	Runnable ob2=() ->{
			for(int i=1;i<=5;i++) {
				System.out.println("Helloo");
				try{Thread.sleep(500);} catch(Exception e) {}
			}
		}
	;
	
	Thread t1=new Thread(ob);
	Thread t2=new Thread(ob2);
	
    t1.start();
	try{Thread.sleep(10);} catch(Exception e) {}
	t2.start();
	

	}

}
