package readingxml;

import java.io.File;
import java.io.IOException;

import javax.naming.NameNotFoundException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingXMLdata {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub

		
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File("./data/files.xml"));
		doc.getDocumentElement().normalize();
		NodeList nameList = doc.getElementsByTagName("_Name");
		for(int i=0;i<nameList.getLength();i++)
		{
			Node n=nameList.item(i);
			if(n.getNodeType()==Node.ELEMENT_NODE)
			{
				Node name=(Element)n;
				String id = (String) ((DocumentBuilderFactory) name).getAttribute("id");
				NodeList namelists = name.getChildNodes();
				for(int j=0;j<namelists.getLength();j++)
				{
					Node nl=namelists.item(j);
					if(nl.getNodeType()==Node.ELEMENT_NODE)
					{
						
						Element namee = (Element)n;
						System.out.println(id+" "+namee.getTagName() +" "+namee.getTextContent());
					}
					
				}
			}
		}
		
		
			
			
		
	}

}
