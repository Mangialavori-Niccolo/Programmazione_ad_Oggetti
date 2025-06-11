package org.Niccolo.collections.mycollections;

import java.util.Objects;

public abstract class MyAbstractCollection implements MyCollection{
    int size;

    protected MyAbstractCollection() {
        this.size = 0;
    }

    void checkBoundaries(int index, int limit){
        if(index < 0 || index > limit) throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public boolean contains(Object o) {
        for(MyIterator iterator = iterator(); iterator.hasNext();){
            Object element = iterator.next();
            if(Objects.equals(element, o)) return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyAbstractCollection: [");
        for(MyIterator iterator = iterator(); iterator.hasNext();){
            Object element = iterator.next();
            sb.append(element.toString()).append(", ");
        }
        sb.append("]");

        return sb.toString();
    }
}
