package ss9_dsa_list.exercise.my_list_array_list;

import java.util.Arrays;
import java.util.Scanner;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) { //edit
        checkIndex(index);
        if (checkCapacity()) {
            System.out.println("The list is full. Input minCapacity > length of current list");
            Scanner scanner = new Scanner(System.in);
            int minCapacity = Integer.parseInt(scanner.nextLine());
            ensureCapacity(minCapacity);
        }
        for (int i = size; i > index; i++) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        checkIndex(index);
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    @Override
    public MyList<E> clone() {
        MyList<E> newObject = new MyList<>();
        newObject.elements = elements;
        newObject.size = size;
        return newObject;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean add(E element) {
        if (checkCapacity()) {
            elements[size] = element;
            size++;
        }
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length && minCapacity > DEFAULT_CAPACITY) {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void clear() {
        for (int i = 0; i < size(); i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
        }
    }

    public boolean checkCapacity() {
        if (size == elements.length-1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = ", elements = [";
        for (int i = 0; i < size - 1; i++) {
            result += elements[i].toString() + ",";
        }
        result += elements[size - 1] + "]";
        return "MyList{" +
                "size=" + size + result
                + '}';
    }
}
