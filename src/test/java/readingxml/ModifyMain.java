package readingxml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ModifyMain {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		
		ObjectMapper mapper=new XmlMapper();
		InputStream is = new FileInputStream(new File(".//data/files.xml"));
		TypeReference<List<ModifyXML>> typeReference = new TypeReference<List<ModifyXML>>() {};
		List<ModifyXML> mxml = mapper.readValue(is, typeReference);
		
		for (ModifyXML m:mxml)
		{
			System.out.println( m.getHeader());
		}
	}

}
