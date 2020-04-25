package com.kodilla.testing.testing.library;

import java.util.Objects;

public class Book{
    private String tittle;
    private String author;
    private int publicationYear;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(tittle, book.tittle) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode(){
        return Objects.hash(tittle, author, publicationYear);
    }

    public String getTittle(){
        return tittle;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public Book(String tittle, String author, int publicationYear){
        this.tittle = tittle;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
