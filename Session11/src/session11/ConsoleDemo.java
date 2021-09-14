package session11;
import java.io.*;
public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uname,password;
	    Console c=System.console();
	    System.out.println("Enter your name: ");
	    uname=c.readLine();
	    System.out.println("User name="+uname);
	    System.out.println("Enter password: ");
	    char ch[]=c.readPassword();
	    //converting char array to string
	     password=String.valueOf(ch);
	    System.out.println("Password is= "+password);
	}
}
