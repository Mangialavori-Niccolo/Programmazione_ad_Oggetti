package org.Niccolo.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook{
    final Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person person) {
        for (int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null && phoneBook[i].equals(person)) return false;
        }

        for (int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] == null){
                phoneBook[i] = person;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean removePerson(Person person) {
        for (int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null && phoneBook[i].equals(person)){
                phoneBook[i] = null;
                return true;
            }
        }

        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        int count = 0;
        Person[] res = new Person[MAX_PERSONS];
        for (int i = 0; i < MAX_PERSONS; i++){
            if (phoneBook[i] != null && phoneBook[i].getLastname().equals(lastname)){
                res[count] = phoneBook[i];
                count++;
            }
        }

        return Arrays.copyOf(res, count);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        int count = 0;
        Person[] res = new Person[MAX_PERSONS];
        for (int i = 0; i < MAX_PERSONS; i++){
            if (phoneBook[i] != null && phoneBook[i].getName().equals(name) && phoneBook[i].getLastname().equals(lastname)){
                res[count] = phoneBook[i];
                count++;
            }
        }

        return Arrays.copyOf(res, count);
    }
}
