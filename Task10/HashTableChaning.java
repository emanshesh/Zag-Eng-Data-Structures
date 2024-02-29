
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class HashTableChaning {

  
    private LinkedList<Entry>[] table; 

    public HashTableChaning() {
        table = new LinkedList[table.length]; 
    }
    private int hash(int key) {
        return Math.abs(key % table.length); 
    }
    public void put(int key, String value) {
        int index = hash(key); 
        LinkedList<Entry> list = table[index]; 

        if (list == null) {
            list = new LinkedList<>();
            table[index] = list;
        }
        for (Entry entry : list) {
            if (entry.getKey() == key) {
                entry.setValue(value); 
                return;
            }
        }
        list.add(new Entry(key, value));
    }
    public String get(int key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        if (list == null) {
            return null; 
        }
        for (Entry entry : list) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }

        return null; 
    }
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        if (list == null) {
            return; 
        }

       
        Entry toRemove = null; 
        for (Entry entry : list) {
            if (entry.getKey() == key) {
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
        for (LinkedList<Entry> list : table) {
            if (list != null) {
                count += list.size();
            }
        }
        return count;
    }
    private static class Entry {
        private final int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
        public int getKey() {
            return key;
        }
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }
}