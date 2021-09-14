package session13;
import java.io.*;

public class FRDemo {

	public static void main(String[] args)throws IOException {
		FileReader fr=new FileReader("E:/first.txt");
		int i;
		while((i=fr.read())!=-1)
			System.out.println((char)i);
		fr.close();
	}

}
