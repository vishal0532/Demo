package practise;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class test3 {

	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String path="C:\\Users\\vishal_naik\\Desktop\\Data.xml";
		DocumentBuilderFactory db=DocumentBuilderFactory.newInstance();
               DocumentBuilder db1=db.newDocumentBuilder();
               Document doc=db1.parse(path);
                 doc.getDocumentElement().normalize();
                 
                 
             
	}

}
