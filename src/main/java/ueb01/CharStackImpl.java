package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private CharElement head;
    private CharElement tail;
   public void push(char c) {
       if(head == null) {
           head = new CharElement(c,null);
           tail = head;
           return;
       }
       CharElement it = head;
        while(it.next != null) {
            it = it.next;
        }

        it.next = new CharElement(c,null);
        tail = it.next;

    }
    public char pop() {
        if(head == null) {
            throw new NoSuchElementException();
        }
        if(head == tail) {
            char rem = tail.letter;
            head = null;
            tail = null;
            return rem;
        }
        CharElement it = head;
        while(it.next != tail) {
            it = it.next;
        }
        char rem = tail.letter;
        tail = it;
        it.next = null;
        return rem;

    }
    public int size() {
    CharElement it = head;
    int n = 0;
    while(it != null) {
        n++;
        it = it.next;
    }
    return n;
    }
}
