package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    Element top;
    int length =0;

    @Override
    public void push(char c) {
        Element e = new Element();


        e.c = c;
        e.next=top;
        top=e;
        length++;
    }

    @Override
    public char pop() {
        if(top==null){
            throw new NoSuchElementException();
        }
        char h =top.c;
        top=top.next;
        length--;
        return h;

    }

    @Override
    public int size() {
        return length;
    }
}
