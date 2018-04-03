package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {

    private StackClass head;

    public void push(char c) {
        // Wenn kein Objekt vorhanden ist C head
        if(head == null){
            head = new StackClass(c, null);

        }
        // Wenn Objekt vorhanden, dann so lange iterieren bis "next" null ist und C auf den Stack einlegen
        StackClass iter = head;
        while (iter.next != null){
            iter = iter.next;

        }
        iter.next = new StackClass(c,null);
    }


    @Override
    public int size() {

        int length;
        StackClass iter = head;

        // Wenn null dann ist auch die länge null
        if(iter == null) {
            return 0;


        //Iterieren so lange bis "iter.next" null ist und length immer um eins erhöhen
        }else{

            length = 0;
            while (iter.next != null) {
            iter = iter.next;
            length++;
         }
        }

        return length;
    }


    @Override
    public char pop() {
        //Wenn kein Objekt vorhanden, dann kann auch nichts rausgenommen werden
        if(head == null)
            throw new NoSuchElementException();
        else
        //Wenn nur ein Objekt vorhanden, dann diese rausnehmen und Objekt merken
        if(head.next == null){
            char head1 ;
            head1 = head.next.value;
            return head1;
        }

        StackClass vor = null;
        StackClass iter = head;

        while(iter.next != null) {
            vor = iter;
            iter = iter.next;
        }

        char remove = vor.next.value;
        vor.next = null;
        return remove;

    }


}
