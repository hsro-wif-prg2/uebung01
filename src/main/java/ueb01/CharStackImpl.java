package ueb01;

import java.util.NoSuchElementException;
import java.util.Arrays;

class CharStackImpl implements CharStack {

    private char[] charStack;

    public void push(char c) {
        //checks if value is valid


        //adds Char
        char[] updatedStack = Arrays.copyOf(charStack, charStack.length + 1);

        updatedStack[updatedStack.length - 1] = c;
        charStack = updatedStack;
    }

    public int size() {
        return charStack.length;
    }

    public char pop() {
        if (charStack.length == 0) {
            throw new NoSuchElementException();
        }

        char toReturn = charStack[charStack.length - 1];
        char[] updatedStack = Arrays.copyOfRange(charStack, 0, charStack.length - 1);

        charStack = updatedStack;

        return toReturn;
    }

    //constructor
    public CharStackImpl(char[] charStack) {
        this.charStack = charStack;
    }

    //default constructor
    public CharStackImpl() {
        this.charStack = new char[0];
    }
}
