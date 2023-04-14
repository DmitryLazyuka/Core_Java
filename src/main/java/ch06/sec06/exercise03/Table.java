package ch06.sec06.exercise03;

import java.util.ArrayList;
public class Table <K, V>{
    private ArrayList<Entry<K,V>> list;
    public Table() {
        this.list = new ArrayList<>();
    }
    public V getValue (K key){
      return findEntryByKey(key).getValue();
    }
    public void add(K key, V value) {
        list.add(new Entry<>(key,value));
    }
    public void putValue(K key, V value){
        findEntryByKey(key).setValue(value);
    }
    public void removeKey(K key){
        list.remove(findEntryByKey(key));
    }
    private class Entry<K,V> {
        private K key;
        private V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
        public void setValue(V value) {
            this.value = value;
        }
    }
    private Entry<K, V> findEntryByKey(K key) {
        return list.stream()
                .filter(e -> e.getKey().equals(key))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No such element"));
    }
}