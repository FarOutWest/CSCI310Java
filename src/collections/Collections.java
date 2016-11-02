package collections;

import java.util.*;

public class Collections {
    public static void updatefirst(LinkedList<String> names, String name) {
        names.addFirst(name);
    }
    
    public static void updatelast(LinkedList<String> names, String name) {
        names.addLast(name);
    }
    
    public static void removefront(LinkedList<String> list) {
        list.removeFirst();
    }
    
    public static void removeback(LinkedList<String> list) {
        list.removeLast();
    }
    
    public static void addindex(int num, String name, LinkedList<String> list) {
        list.add(num, name);
    }
    
    public static void removeindex(LinkedList<String> list, int num) {
        list.remove(num);
    }
    
    public static void main(String args[]) {
        LinkedList<String> names = new LinkedList<String>();

        names.add("Luke");
        names.add("Han");
        names.add("Chewie");
        names.add("R2-D2");
        
        updatefirst(names, "Vader");
        updatelast(names, "Boba Fett");
        System.out.println("LinkedList Content after addition: " + names);

        Object var = names.get(0);
        System.out.println("First element: " + var);
        names.set(0, "Lando");
        Object var2 = names.get(0);
        System.out.println("First element after update by set method: " + var2);

        removefront(names);
        removeback(names);
        System.out.println("LinkedList after deletion of first and last element: " + names);
        
        addindex(0, "C3PO", names);
        removeindex(names, 2);
        System.out.println("Final Content: " + names);
    }
}
