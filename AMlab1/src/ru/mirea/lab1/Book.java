package ru.mirea.lab1;

public class Book {
    private String author;
    private String bookName;
    private Integer publicationYear;

    public Book(String author, String bookName, Integer publicationYear) {
        setAuthor(author);
        setBookName(bookName);
        setPublicationYear(publicationYear);
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }
    public String getBookName() {
        return bookName;
    }
    public Integer getPublicationYear() {
        return publicationYear;
    }
}
