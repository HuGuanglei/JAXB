package com.guanglei.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class JAXBDemo {
	
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger( JAXBDemo.class );
		try {
			JAXBContext jcon = JAXBContext.newInstance(Catalog.class);
			Unmarshaller unmarshaller = jcon.createUnmarshaller();
			String xml = FileUtils.readFileToString(new File("books.xml"), "utf-8");
			StreamSource stream = new StreamSource(new StringReader(xml));
			Catalog catalog = (Catalog)unmarshaller.unmarshal(stream);
			System.out.println(catalog.getBooks().get(0).getAuthor());
			
		}
		catch(Exception e) {
			logger.error("Something is wrong here");
		}
	}

}
