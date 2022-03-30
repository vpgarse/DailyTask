package imp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Read1 {
	
	
	
	   public static void main(String[] args) throws Exception 
	   {
	      int cnt=0;
	      String s;
	      String[] buffer; 
	      File f1=new File(".//data/document.txt"); 
	      FileReader fr = new FileReader(f1);
	      BufferedReader bfr = new BufferedReader(fr);
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the word to be Searched");
	      String wrd=sc.nextLine();
	       
	           
	      while((s=bfr.readLine())!=null)   
	      {
	         buffer=s.split(" ");  
	          for (String chr : buffer) 
	          {
	                 if (chr.equals(wrd))   
	                 {
	                   cnt++;    
	                 }
	          }
	      }
	      if(cnt==0)  
	      {
	         System.out.println("Word not found!");
	      }
	      else
	      {
	         System.out.println("Word : "+wrd+"found! Count : "+cnt);
	      }
	      
	         fr.close();
	   }


}
