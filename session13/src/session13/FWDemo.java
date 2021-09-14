package session13;

import java.io.*;

public class FWDemo {

	public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("E:/third.txt");
		fw.write("My name is NarasimhaSai");
		fw.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("Success");

	}

}
