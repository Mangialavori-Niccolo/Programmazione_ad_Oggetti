package org.Niccolo.oop.library;


import java.time.LocalDate;
import java.util.ArrayList;


public class Library {
    private ArrayList<Rent> rents;

    public Library(){
        rents = new ArrayList<>();
    }

    public boolean addRent(Rent rent){
        return rents.add(rent);
    }

    public boolean removeRent(Rent rent){
        return rents.remove(rent);
    }

    public ArrayList<Rent> getExpired(LocalDate date){
        ArrayList<Rent> tmp = new ArrayList<>();
        for(Rent r : rents){
            if(r.isExpired(date)) tmp.add(r);
        }
        return tmp;
    }
}
