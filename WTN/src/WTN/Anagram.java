package WTN;

import java.util.*;

public class Anagram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		String str2=sc.next();
		str=str.toLowerCase();
		str2=str2.toLowerCase();
		
		int len1=str.length();
		int len2=str2.length();
		
		if(len1!=len2) {
			System.out.print("ok");
		}
		else {
			char ss[] = str.toCharArray();
			char aa[] = str2.toCharArray();
			
			
			Arrays.sort(aa);
			Arrays.sort(ss);
			if(Arrays.equals(aa,ss)==true) {
				System.out.print("Anagram");
			}
			else {
				System.out.print("NO");
			}
		}

	}

}
