package com.kodilla.stream.immutable;

public final class Book{

    private final String tittle;
    private final String author;
    private final int yearOfPublication;

    public String getTittle(){
        return tittle;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public Book(final String tittle, final String author, final int yearOfPublication){
        this.tittle = tittle;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    }

