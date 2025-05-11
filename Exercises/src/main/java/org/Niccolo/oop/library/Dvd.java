package org.Niccolo.oop.library;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Dvd extends Item{
    private int length;

    public Dvd(String title, int year, int length) {
        super(title, year);
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dvd dvd = (Dvd) o;
        return length == dvd.length && year == dvd.year && Objects.equals(title, dvd.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, year, title);
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "length=" + length +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
