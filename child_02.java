import java.util.ArrayList;
import java.util.List;


public class child_02  {
	
	
	
		
		
	

	
	public static void main(String[] args) {
		
		
		List<String> l1=new ArrayList();
		
		l1.add("indiaa");
		
		l1.add("afg");
		
		l1.add("eng");
		
		l1.add("aus");
		
		l1.add("nzl");
		
		l1.add("sat");
		
		
		  boolean found = false;
		  
		  for(String country : l1) { 
			  if(country.equals("muss")) { 
				  found = true;
				  break;
		  } }
		  
		  if(!found) { System.out.println("country not  available"); } else {
		  System.out.println("country  present"); }
		 
		
		
		/*
		 * if (!l1.contains("veera")) { System.out.println("country not present"); }
		 * else { System.out.println("country  available"); }
		 */
		
	}
	
	
	
	
	
	

	

}
