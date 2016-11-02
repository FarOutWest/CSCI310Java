package collections;

import java.util.*;

public class Collections {
    public static void main(String args[]) {
        LinkedList<String> names = new LinkedList<String>();

        names.add("Luke");
        names.add("Han");
        names.add("Chewie");
        names.add("R2-D2");
        
        names.addFirst("Vader");
        names.addLast("Boba Fett");
        System.out.println("LinkedList Content after addition: " + names);

        Object var = names.get(0);
        System.out.println("First element: " + var);
        names.set(0, "Lando");
        Object var2 = names.get(0);
        System.out.println("First element after update by set method: " + var2);

        names.removeFirst();
        names.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + names);

        names.add(0, "C3PO");
        names.remove(2);
        System.out.println("Final Content: " + names);
    }
}
