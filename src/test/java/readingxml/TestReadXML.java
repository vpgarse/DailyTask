package readingxml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class TestReadXML {
	

public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
	ReadXML rxml=new ReadXML();
	/* rxml.readXMLData("Header",".//data/files.xml"); */

	/*
	 * rxml.perticularTag("TransactionID"); rxml.perticularTag("DataName",".//data/files.xml");
	 * rxml.perticularTag("AckRequest",".//data/files.xml");
	 */
    
    //not working 
    rxml.perticularTag("success", ".//data/success.xml");
	
	
	//rxml.getXMLAttributeValue("success", null, "")
}

}
