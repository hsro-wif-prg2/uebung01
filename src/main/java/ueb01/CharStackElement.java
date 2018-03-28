package ueb01;

public class CharStackElement {

    public char value;
    public CharStackElement next;

    public CharStackElement(char value, CharStackElement next) {
        this.value = value;
        this.next = next;
    }
}
