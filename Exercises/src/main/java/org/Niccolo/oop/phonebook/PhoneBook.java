package org.Niccolo.oop.phonebook;

public interface PhoneBook {
    final int MAX_PERSONS = 256;

    boolean addPerson(Person person);

    boolean removePerson(Person person);

    Person[] searchByLastname(String lastname);

    Person[] searchByNameAndLastname(String name, String lastname);
}
