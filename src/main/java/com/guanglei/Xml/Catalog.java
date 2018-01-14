package com.guanglei.Xml;
import java.util.*;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "catalog")
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	
	@XmlElement(name = "book")
	private List<Book> books;
	//add get and set method

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Catalog [books=" + books + "]";
	}
	
}
	
