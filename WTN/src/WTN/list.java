package WTN;


import java.util.*;


public class list {

	public static void main(String[] args) {
		
		
	    List<Integer> n = new ArrayList<>();
	    n.add(404); 	//Integer n= new Integer();
	    n.add(908);
	    n.add(639);
	 
	    n.add(265);
	   
	    Comparator<Integer> c=new Comparator<Integer>() {
	    	public int compare(Integer i,Integer j) {
	    		if(i%10>j%10) {
	    			return 1;
	    		}
	    		else {
	    			return -1;
	    		}
	    	}};

			
	   // n.add(2,3);
	    
	    
	    Collections.sort(n,c); 
	    
	    
	    
	    
	    
	    
	    
	    
	  //Collections.reverse(n);
	    
	    //System.out.print(n);
	 /*   
	    Iterator<Integer> it = n.iterator();
	    while(it.hasNext()) {
	    System.out.println(it.next());
	 
		}
		*/
	    
	    for(int i=0;i<n.size();i++) {
	    	System.out.println(n.get(i));
	    }
	}

}
