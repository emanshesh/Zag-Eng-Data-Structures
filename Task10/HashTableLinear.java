
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class HashTableLinear {

    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count;
    private int[] keys;
    private String[] values;
    int key;

    public HashTableLinear() {
        this(DEFAULT_CAPACITY);
    }

    public HashTableLinear(int capacity) {
        this.capacity = capacity;
        keys = new int[capacity];
        values = new String[capacity];
        Arrays.fill(keys, -1); 
        count = 0;
    }

    private int hash(int key) {
        return Math.abs(key % capacity);
    }

    private int probe(int index) {
        int i = index;
        while (keys[i] != -1 && keys[i] != key) {
            i = (i + 1) % capacity;
            if (i == index) { 
                throw new IllegalStateException("Hash table is full");
            }
        }
        return i;
    }

    public void put(int key, String value) {
        int index = hash(key);
        int i = probe(index);

        keys[i] = key;
        values[i] = value;
        count++;
    }

    public String get(int key) {
        int index = hash(key);
        int i = index;
        while (keys[i] != -1) {
            if (keys[i] == key) {
                return values[i];
            }
            i = (i + 1) % capacity;
            if (i == index) {
                return null;
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        int i = index;
        while (keys[i] != -1) {
            if (keys[i] == key) {
                keys[i] = -1;
                values[i] = null;
                count--;
                break;
            }
            i = (i + 1) % capacity;
            if (i == index) {
                return;
            }
        }
    }

    public int size() {
        return count;
    }
}