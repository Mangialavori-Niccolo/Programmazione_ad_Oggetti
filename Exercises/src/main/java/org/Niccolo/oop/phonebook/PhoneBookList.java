package org.Niccolo.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person person) {
        if(phoneBook.contains(person) || phoneBook.size() >= MAX_PERSONS) return false;
        else return phoneBook.add(person);
    }

    @Override
    public boolean removePerson(Person person) {
        return phoneBook.remove(person);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phoneBook){
            if(p.getLastname().equals(lastname)) tmp.add(p);
        }
        return tmp.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phoneBook){
            if(p.getName().equals(name) && p.getLastname().equals(lastname)) tmp.add(p);
        }
        return tmp.toArray(new Person[]{});
    }
}
