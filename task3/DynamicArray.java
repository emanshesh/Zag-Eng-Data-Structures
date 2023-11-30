/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class DynamicArray {
    int [] items;
    int size=0;
    int count=0;
    public DynamicArray(int n){
        size =n;
        items =new int[size];
    }
    public void printArray() {
        for (int i = 0; i < count; i++)
            System.out.print(items[i] + "");

        }
    public void insert(int item) {
            if (count == size) {
                size = size * 2;
                int[] newArray = new int[size];
                for (int i =0; i < count; i++)
                    newArray[i] = items[i];

                items = newArray;

            }
                items[count] = item;
                count++;
            }
    public void removeAt(int index) {
        if (index<0||index>count)
            throw new IllegalThreadStateException();

        for(int i=index;i<count-1;i++)
            items[i]=items[i+1];
        count--;
    }

    puplic int indexOf(int item){
        for(int i=0;i<count;i++)
            if(item== items[i])
                return i;
        return -1;

    }

    public void remove(int item) {
        int index= indexOf(item);
        if (index != -1)
            removeAt(index);
    }
    public int max(){
        int max =items[0];
        for(int i=1;i<items.length;i++) {
            if (items[i] > max)
                max = items[i];
        }
        return max;
        }
    public int min(){
        int min =items[0];
        for(int i=1;i<items.length;i++) {
            if (items[i] < min)
                min = items[i];
        }
        return min;
    }

    private static class puplic {

        public puplic() {
        }
    }
    }


