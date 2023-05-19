package ss10_dsa_stack_queue.practice.practice_1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> abc;

    public MyGenericStack() {
        abc = new LinkedList<>();
    }

    public void push(T element) {
        abc.addLast(element);
    }

    public T pop() {
        if (laRong()) {
            throw new EmptyStackException();
        }
        return abc.removeLast();
    }

    public int size() {
        return abc.size();
    }

    public boolean laRong() {
        return abc.size() == 0 ? true : false;
    }
}
