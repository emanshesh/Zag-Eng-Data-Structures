
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 * @param <K>
 * @param <v>
 */
import java.util.LinkedList;

public class HashTableChaining<K, V> {
    private final LinkedList<Entry<K, V>>[] table;

    public HashTableChaining(int size) {
        table = new LinkedList[size];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    }

    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table[index];

        if (list == null) {
            list = new LinkedList<>();
            table[index] = list;
        }
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        list.add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table[index];

        if (list == null) {
            return null;
        }
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table[index];

        if (list == null) {
            return;
        }

        Entry<K, V> toRemove = null;
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                toRemove = entry;
                break;
            }
        }
        if (toRemove != null) {
            list.remove(toRemove);
        }
    }

    public int size() {
        int count = 0;
        for (LinkedList<Entry<K, V>> list : table) {
            if (list != null) {
                count += list.size();
            }
        }
        return count;
    }

    private static class Entry<K, V> {
        private final K key;
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
}