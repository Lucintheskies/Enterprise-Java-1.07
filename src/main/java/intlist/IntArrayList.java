package intlist;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] array = new int[10];
    private int size = 0;

    @Override
    public void add(int number) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length + array.length / 2);
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) throw new IndexOutOfBoundsException();
        return array[id];
    }
}

