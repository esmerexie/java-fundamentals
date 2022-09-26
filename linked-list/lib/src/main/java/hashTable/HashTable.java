package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class HashTable<K, V> {

    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;
    int size;

    public HashTable(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("Hashmap size must be greater than one!");
        }
        this.size = size;
        this.bucketArrayList = new ArrayList<>(size);

        for (int i = 0; i < this.size; i++) {
            bucketArrayList.add(i, new LinkedList<HashMapPair<>>());
        }
    }

    public void set(K key, V value) {
        // TODO: implement me
    }

    public V get(K key){
        // TODO: implement me
        return null;
    }

    public List<K> getKeys(){
        // TODO: implement me
        return null;
    }

    public boolean contains(){
        // TODO: implement me
        return false;
    }

}
