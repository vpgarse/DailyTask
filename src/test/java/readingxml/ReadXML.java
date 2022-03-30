package readingxml;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {


	public void readXMLData(String Attributt_Name){
		//get Document Builder
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//Get Document 
			Document document = builder.parse(new File(".//data/files.xml"));
			//Normalize xml Structure 
			document.getDocumentElement().normalize();
			//Get all the Element By tagName
			NodeList keylist = document.getElementsByTagName("Transaction");
			for (int i=0;i<keylist.getLength();i++)
			{
				Node keys = keylist.item(i);

				if (keys.getNodeType()==Node.ELEMENT_NODE)
				{
					Element KeysElement=(Element) keys;
					System.out.println(Attributt_Name+" :"+KeysElement.getAttribute(Attributt_Name));
					NodeList Keysdetails = keys.getChildNodes();
					for (int j=0;j<Keysdetails.getLength();j++)
					{
						Node details = Keysdetails.item(j);
						if(details.getNodeType()==Node.ELEMENT_NODE)
						{
							Element detailselement=(Element) details;
							System.out.println("  "+detailselement.getTagName()+" :   "+detailselement.getTextContent());
						}
					}
				}
			}	
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void perticularTag(String TageName, String FilePath) throws SAXException, IOException, ParserConfigurationException
	{
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();


		DocumentBuilder builder = factory.newDocumentBuilder();
		//Get Document 
		Document document = builder.parse(new File(FilePath));
		//Normalize xml Structure 
		document.getDocumentElement().normalize();
		//Get all the Element By tagName
		NodeList keylist = document.getElementsByTagName(TageName);
		Node keys = keylist.item(0);
		if (keys.getNodeType()==Node.ELEMENT_NODE)
		{
			Element KeysElement=(Element) keys;
			System.out.println(TageName+"  :"+KeysElement.getTextContent());
		}
	}

	
	
		public void setXMLTagname(String TageName,String setValue) throws  IOException, SAXException, ParserConfigurationException, TransformerException {

		    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder builder = factory.newDocumentBuilder();
		    //Get Document
		    Document document = builder.parse(new File(".//data/files.xml"));
		    //Normalize xml Structure
		    document.getDocumentElement().normalize();
		    //Get all the Element By tagName
		    NodeList keylist = document.getElementsByTagName(TageName);
		    Node keys = keylist.item(0);
		    Element KeysElement = null;
		    if (keys.getNodeType() == Node.ELEMENT_NODE) {
		        KeysElement = (Element) keys;
		        KeysElement.setTextContent(setValue);
		    }
		    System.out.println(TageName + " :" + KeysElement.getTextContent());
		
		    TransformerFactory transformerFactory = TransformerFactory.newInstance();
		    
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
 
            StreamResult streamResult = new StreamResult(new File(".//data/store.xml"));
            transformer.transform(domSource, streamResult);
 
            System.out.println("The XML File was ");
	}
		
		public void getXMLAttributeValue( String tagName, String attributeName,String FilePath) throws ParserConfigurationException, SAXException, IOException  {
		   

		        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		         DocumentBuilder builder = factory.newDocumentBuilder();
		        Document doc = builder.parse(new File(FilePath));
		        NodeList nodeList = doc.getElementsByTagName(tagName);
		        for (int i = 0; i < nodeList.getLength(); i++) {
		            Node node = (Node) nodeList.item(i);
		            if (node.hasAttributes()) {
		              Node attr= node.getAttributes().getNamedItem(attributeName);
		              System.out.println(attr.getNodeValue());
		            }
		        }
		}
		
		                   
		public Map<String,String> getXMLAttributeValueList( String tagName, String keyname,String valuename)  {
		    String attribute = "";
		    Map<String, String> map = new HashMap<String, String>();
		    try {

		        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		          DocumentBuilder builder = factory.newDocumentBuilder();
		          Document doc = builder.parse(new File(".//data/new2.xml"));
		        NodeList nodeList = doc.getElementsByTagName(tagName);
		        for (int i = 0; i < nodeList.getLength(); i++) {
		            Node node = (Node) nodeList.item(i);
		            if (node.hasAttributes()) {
		                Attr key = (Attr) node.getAttributes().getNamedItem(keyname);
		                Attr value = (Attr) node.getAttributes().getNamedItem(valuename);
		                if (key != null && value != null) {
		                    map.put(key.getValue(),value.getValue());
//		                    LOGGER.debug("KEY :"+ key.getValue());
//		                    LOGGER.debug("Value :"+ value.getValue());
		                }
		            }
		        }
		    }catch (Exception e)
		    {
		        e.printStackTrace();
		        //LOGGER.debug(UID + e.getMessage());
		    }
		    return  map;

		}
		
		public Map<String,String> setXMLAttributeValueList( String tagName, String keyname,String valuename)  {
		    String attribute = "";
		    Map<String, String> map = new HashMap<String, String>();
		    try {

		        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		          DocumentBuilder builder = factory.newDocumentBuilder();
		          Document doc = builder.parse(new File(".//data/new2.xml"));
		        NodeList nodeList = doc.getElementsByTagName(tagName);
		        for (int i = 0; i < nodeList.getLength(); i++) {
		            Node node = (Node) nodeList.item(i);
		            if (node.hasAttributes()) {
		            	Attr key = (Attr) node.getAttributes().getNamedItem(keyname);
		                Attr value = (Attr) node.getAttributes().getNamedItem(valuename);
		                if (key != null && value != null) {
		                    map.put(key.getValue(),value.getValue());
//		                    LOGGER.debug("KEY :"+ key.getValue());
//		                    LOGGER.debug("Value :"+ value.getValue());
		                }
		            }
		        }
		    }catch (Exception e)
		    {
		        e.printStackTrace();
		        //LOGGER.debug(UID + e.getMessage());
		    }
		    return  map;

		}
		            
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, TransformerException {
		ReadXML rxml=new ReadXML();
		// for all tags value 
//		rxml.readXMLData("Header");
        // for particular tag value 
//		rxml.perticularTag("TransactionID");
//		rxml.perticularTag("DataName");
//		rxml.perticularTag("AckRequest");
//		rxml.setXMLTagname("AckRef","9");
//		rxml.setXMLTagname("AckRequest","YES");
//		rxml.setXMLTagname("CreatedBy","22214809");
		
//		rxml.getXMLAttributeValue("FOLDER", "PORT_ID");
//		rxml.getXMLAttributeValue("FOLDER", "PLATFORM_ID");
		
		
		//rxml.getXMLAttributeValueList( "CONTACT_POINT", "_Value");
//		Map<String, String> resultmap=new HashMap<String,String>();
//		resultmap=rxml.getXMLAttributeValueList("KEY","_Name","_Value");
//		
//		System.out.println(resultmap.get("RRRNumber"));
		
		Map<String, String> resultmap1=new HashMap<String,String>();
		resultmap1=rxml.setXMLAttributeValueList("KEY", "K", "v");
		
		System.out.println(resultmap1.get("RRRNumber"));
	}

}


