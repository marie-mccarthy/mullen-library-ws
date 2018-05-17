package edu.mullen.library;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Book {
	private String author;
	private String title;
	private int bookID;
	private String imageLink;

	public Book(String author, String title, int bookID, String imageLink) {

		this.author = author;
		this.title = title;
		this.bookID = bookID;
		this.imageLink = imageLink;
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

	@JsonProperty
	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	@Override
	public String toString() {
		return "Book{" +
				"author='" + author + '\'' +
				", title='" + title + '\'' +
				", bookID=" + bookID +
				", imageLink='" + imageLink + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return bookID == book.bookID &&
				Objects.equals(author, book.author) &&
				Objects.equals(title, book.title) &&
				Objects.equals(imageLink, book.imageLink);
	}

	@Override
	public int hashCode() {

		return Objects.hash(author, title, bookID, imageLink);
	}
}