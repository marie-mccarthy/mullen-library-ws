package edu.mullen.library;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class BookMapper implements ResultSetMapper<Book>
{
	

	@Override
	public Book map(int i, ResultSet resultSet, StatementContext ctx) throws SQLException {
		// TODO Auto-generated method stub
		return new Book(resultSet.getString("author"), resultSet.getString("title"), resultSet.getInt("book_id"), resultSet.getString("image_link"));
		 
	}


}

