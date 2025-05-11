package org.Niccolo.oop.library;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
public class Rent {
    private Item item;
    private Person person;
    private LocalDate begin;
    private LocalDate end;

    public Rent(Item item, Person person, LocalDate begin, LocalDate end) {
        this.item = item;
        this.person = person;
        this.begin = begin;
        this.end = end;
    }

    public boolean isExpired(LocalDate date){
        return end.isBefore(date);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return Objects.equals(item, rent.item) && Objects.equals(person, rent.person) && Objects.equals(begin, rent.begin) && Objects.equals(end, rent.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, person, begin, end);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "item=" + item +
                ", person=" + person +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }
}
