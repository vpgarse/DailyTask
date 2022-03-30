package wordFileDocs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ReadDocFile {

	

public static void objectDocs()
{
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\vpgarse\\Desktop\\Assignments.docx");
			// reading Docs  file from desktop by using FileInputStram 
			XWPFDocument docs=new XWPFDocument(fis);
			List<XWPFParagraph> paragraphList = docs.getParagraphs();
			
			
			for (XWPFParagraph paragraph:paragraphList)
			{
				String object = paragraph.getText();
				// Stored Word file text in object variable 
				System.out.println(object);
				
//				FileOutputStream fos=new FileOutputStream("‪C://Users//vpgarse//Desktop//Empty.docx");
//				fos.write(object);
//				fos.close();
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
		public static void main(String[] args) {
			objectDocs();

	}

}
