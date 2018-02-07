package edu.mullen.library;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
private String author; 
private String title; 
private int bookID;
public Book(String author, String title, int bookID) {
	
	this.author = author;
	this.title = title;
	this.bookID = bookID;
}

@JsonProperty
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@JsonProperty
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
@JsonProperty
public int getBookID() {
	return bookID;
}
public void setBookID(int bookID) {
	this.bookID = bookID;
}
@Override
public String toString() {
	return "Book [author=" + author + ", title=" + title + ", bookID=" + bookID + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + bookID;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (bookID != other.bookID)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}


}
