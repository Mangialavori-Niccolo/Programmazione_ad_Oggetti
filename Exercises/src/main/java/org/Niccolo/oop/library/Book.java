package org.Niccolo.oop.library;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Book extends Item{
    private int pages;

    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return pages == book.pages && year == book.year && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
