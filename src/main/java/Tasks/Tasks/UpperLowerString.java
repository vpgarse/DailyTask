package Tasks.Tasks;

public class UpperLowerString {
	
	public static void main(String[] args) {
		
	

	int lower=0;
	String s="VaibhaV";
	int upper=0;
	
	
	
	for(int i=0; i<s.length(); i++){

	     if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	     {
	            upper++;
	      }
	     else 
	    	 if(s.charAt(i)>='a' && s.charAt(i)<='z')
	       {   
	    		 lower++;
	        }
	 } System.out.println("no of upper chars are="+upper); System.out.println("no of lower chars are="+lower);
	}
}
	
