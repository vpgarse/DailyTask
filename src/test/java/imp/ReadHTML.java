package imp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ReadHTML {
	

public static void textFileRead(String tittle) throws IOException
{
	String text = "";
    int lineNumber;
   try {
      FileReader readfile = new FileReader(".//data/document.txt");
      BufferedReader readbuffer = new BufferedReader(readfile);
      
      for (lineNumber = 1; lineNumber < 5736; lineNumber++) {
        if (lineNumber == 866) {
          text = readbuffer.readLine();
          if (text.contains(tittle))
          {
        	  text=readbuffer.readLine();
        	
          }
        } else
          readbuffer.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  
      
    String[] str=text.trim().split(">");
   String str1 = text.toString();
    
    Document doc = Jsoup.parse(str1);
    Element result = doc.selectFirst("div");
    String title = result.toString();
    
    System.out.println(title);	
}

	
	public static void main(String[] args) throws IOException  {
		
		
		textFileRead("Current Queue:");
		  
		 
		    
		    //System.out.println(title);
		    
		
		    
		    
		/*    String body = orderResponse.getBody().asString();
		    org.jsoup.nodes.Document doc = Jsoup.parse(body);
		    org.jsoup.nodes.Element result = doc.selectFirst("title");
		    String titleValue = result.toString();*/
		
		/*
		 * int n = 866; // The line number String line; try (Stream<String> lines =
		 * Files.lines(Paths.get(".//data/document.txt"))) { line =
		 * lines.skip(n).findFirst().get(); System.out.println(line); }
		 * catch(IOException e){ System.out.println(e); }
		 */
		
		/*
		 * FileReader fr=new FileReader(".//data/document.txt"); BufferedReader br=new
		 * BufferedReader(fr);
		 * 
		 * String str;
		 * 
		 * while ((str=br.readLine())!=null) {
		 * 
		 * System.out.println(str); }
		 */
	}

}
