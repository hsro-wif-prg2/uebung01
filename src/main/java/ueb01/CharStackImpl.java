package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {

    private CharStackElement first;


    @Override
    public void push(char c) {

        first = new CharStackElement(c,first);

    }

    @Override
    public char pop() {

        //nichts zum poppen
        if (first == null)
            throw new NoSuchElementException("Stack is empty");

        //Wert speichern bevor man ihn rauswirft
        char valueSaver;
        valueSaver = first.value;

        //rauswurf
        first = first.next;

        return valueSaver;
    }

    @Override
    public int size() {
        int stackSize = 0;

        if (first == null)
            return stackSize;

        CharStackElement iterator = first;


        while (iterator != null){

            stackSize++;

            iterator = iterator.next;

        }

        return stackSize;
    }
}
