package readingxml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
public class TagsRead {

	

		    public static void main(String[] args) throws JAXBException {
		        File file = new File(".//data/files.xml");
		        JAXBContext jaxbContext = JAXBContext.newInstance(ReadxmlFronTags.class);

		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		        ReadxmlFronTags read = (ReadxmlFronTags) jaxbUnmarshaller.unmarshal(file);

		        System.out.println("Name :" + read.getComment());
		        System.out.println("Age :" + read.getCorrelationIdentifier());
		        System.out.println("Id :" + read.getCreated());

		

		

	}

}
