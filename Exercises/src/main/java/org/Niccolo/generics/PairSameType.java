package org.Niccolo.generics;

public class PairSameType <T> {
    T first, second;

    public PairSameType(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void swap(){
        T tmp = first;
        first = second;
        second = tmp;
    }
}
