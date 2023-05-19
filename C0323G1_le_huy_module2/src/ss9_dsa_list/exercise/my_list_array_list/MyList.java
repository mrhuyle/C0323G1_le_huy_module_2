package ss9_dsa_list.exercise.my_list_array_list;

import java.util.Arrays;

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

    public void add(int index, E element) {
        checkIndex(index);
        this.add(null);
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
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
        if (elements.length == size) {
            ensureCapacity(elements.length * 2);
        }
        elements[size] = element;
        size++;
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

    @Override
    public String toString() {
        String result = "";
        if (size == 0) {
            return result = "[]";
        } else {
            result = ", elements = [";
            for (int i = 0; i < size - 1; i++) {
                result += elements[i].toString() + ",";
            }
            result += elements[size - 1] + "]";
            return "MyList{" +
                    "size=" + size + result
                    + '}';
        }
    }
}
