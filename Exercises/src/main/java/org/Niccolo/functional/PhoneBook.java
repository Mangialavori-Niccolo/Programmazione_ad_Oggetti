package org.Niccolo.functional;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Optional;

public class PhoneBook {
    final List<Person> persons;

    @Setter
    @Getter
    @ToString
    @EqualsAndHashCode
    static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }
    }


    public PhoneBook(List<Person> persons) {
        this.persons = persons;
    }

    public Optional<Person> searchByLastname(String lastname){
        for(Person p : persons){
            if(p.getLastname().equals(lastname)) return Optional.of(p);
        }
        return Optional.empty();
        //return persons.stream().filter(p -> p.getLastname().equals(lastname)).findFirst();
    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname){
        return persons.stream()
                .filter(p -> p.getName().equals(name) && p.getLastname().equals(lastname))
                .findFirst();
    }
}
