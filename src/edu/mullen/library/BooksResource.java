package edu.mullen.library;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BooksResource 
{

	private BookDAO dao;

	public BooksResource(BookDAO inputDAO) 
	{
		this.dao = inputDAO; 

	}

	@GET
	public List<Book> getBooks()
	{
		List<Book> bookList = dao.getAllBooks(); 
		return bookList; 
	}

}