package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite{
    @Test
    public void testGetListUsingFor() throws Exception{
        //        Given

        BookDirectory bookDirectory = new BookDirectory();


        //        When
        List<Book> books = bookDirectory.getTheBookList();

        //        Then
        int numberOfBooksPublicatedAfter2007;
        int numberOfBooksPublicatedAfter2007stream = IntStream.range(0,books.size())
                .filter(value -> books.get(value).getYearOfPublication()>2007)
                .map(value-> 1)
                .sum();

        numberOfBooksPublicatedAfter2007 = (int) books.stream().filter(book -> book.getYearOfPublication() > 2007).count();
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007stream);

    }
}