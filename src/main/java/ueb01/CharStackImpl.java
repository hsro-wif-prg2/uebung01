package ueb01;

import java.util.NoSuchElementException;

public class CharStackImpl implements CharStack {
    private CharElement top;
    @Override
    public void push(char c) {
        top = new CharElement(c, top);
    }

    @Override
    public char pop() {
        if(top == null) {
            throw new NoSuchElementException("keine Elemente!");
        }
        char v = top.value;
        top = top.next;
        return v;
    }

    @Override
    public int size() {
        int n = 0;
        CharElement it = top;
        while (it != null) {
                n++;
                it = it.next;
        }
        return n;
    }
}
