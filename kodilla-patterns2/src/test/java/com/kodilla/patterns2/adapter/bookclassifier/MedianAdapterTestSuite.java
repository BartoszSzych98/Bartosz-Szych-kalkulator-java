package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author 1", "Title 1", 2000, "000768c"));
        books.add(new Book("Author 2", "Title 2", 2012, "000345u"));
        books.add(new Book("Author 3", "Title 3", 2022, "000153d"));
        books.add(new Book("Author 4", "Title 4", 2023, "00013p9"));
        books.add(new Book("Author 5", "Title 5", 2004, "000183t"));
        books.add(new Book("Author 6", "Title 6", 2017, "000789u"));
        books.add(new Book("Author 7", "Title 7", 2019, "000124o"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2017, median);
    }
}
