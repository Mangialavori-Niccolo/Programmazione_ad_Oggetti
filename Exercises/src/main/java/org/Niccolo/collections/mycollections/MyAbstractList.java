package org.Niccolo.collections.mycollections;

public abstract class MyAbstractList extends MyAbstractCollection implements MyList{
    static class MyListIterator implements MyIterator {
        int position;
        MyList list;

        public MyListIterator(MyList list) {
            this.position = 0;
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return position < list.size();
        }

        @Override
        public Object next() {
            return list.get(position++);
        }
    }

    @Override
    public MyIterator iterator() {
        return new MyListIterator(this);
    }
}
