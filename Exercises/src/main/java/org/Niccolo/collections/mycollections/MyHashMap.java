package org.Niccolo.collections.mycollections;

public class MyHashMap implements MyMap {
    private static final int INIT_SIZE = 8;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private int size = 0;
    private MyList[] table;

    public MyHashMap() {
        initTable(INIT_SIZE);
    }

    private void initTable(int size){
        table = new MyList[size];
        for(int i = 0; i < size; i++){
            table[i] = new MyArrayList();
        }
        this.size = 0;
    }

    @Override
    public Object get(Object key) {
        int bucket = getBucket(key);
        Entry entry = getElement(key, table[bucket]);
        if(entry != null) return entry.getValue();
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        if(capacityRatio() > DEFAULT_LOAD_FACTOR){
            enlarge();
        }
        int bucket = getBucket(key);
        Entry pair = getElement(key, table[bucket]);
        if(pair != null) pair.setValue(value);
        else {
            table[bucket].add(new Entry(key, value));
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        int bucket = getBucket(key);
        Entry pair = getElement(key, table[bucket]);
        if(pair != null){
            table[bucket].remove(pair);
            size--;
        }
    }

    @Override
    public boolean contains(Object key) {
        int bucket = getBucket(key);
        Entry pair = getElement(key, table[bucket]);
        return pair != null;
    }

    public int size(){return size;}

    private int getBucket(Object key){
        return Math.abs(key.hashCode() % table.length);
    }

    private Entry getElement(Object key, MyList list){
        for(int i = 0; i < list.size(); i++){
            Entry pair = (Entry) list.get(i);
            if(pair.key.equals(key)){
                return pair;
            }
        }
        return null;
    }

    private double capacityRatio() {
        return size / (double) table.length;
    }

    private MyList toList(){
        MyList dst = new MyArrayList();
        for(MyList myList : table){
            for(int i = 0; i < myList.size(); i++){
                Entry pair = (Entry) myList.get(i);
                dst.add(pair);
            }
        }
        return dst;
    }

    private void enlarge(){
        MyList list = toList();
        initTable(table.length * 2);
        for(int i = 0; i < list.size(); i++){
            Entry entry = (Entry) list.get(i);
            put(entry.getKey(), entry.getValue());
        }
    }














    private static class Entry{
        private final Object key;
        private Object value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyHashMapPair{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
