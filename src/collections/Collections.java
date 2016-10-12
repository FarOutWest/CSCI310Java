/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kiss.API.Close;
import static kiss.API.EOL;
import static kiss.API.outClose;
import static kiss.API.outExpect;
import static kiss.API.println;

/**
 *
 * @author West
 */
public class Collections {
    void testHashSet() {
        Set<String> names = new HashSet<String>();

        names.add("luke");
        names.add("han");
        names.add("chewie");
        names.add("darth vader");
        names.add("lando");

        try (Close out = outExpect("luke", EOL, "han", EOL, "darth vader", EOL, "chewie", EOL, "lando", EOL)) {
            for (String name : names) {
                println(name);
            }
        }

    }

    void testTreeSet() {
        Set<String> nums = new TreeSet<String>();

        nums.add("1");
        nums.add("2");
        nums.add("3");
        nums.add("4");
        nums.add("5");

        try (Close out = outExpect("1", EOL, "2", EOL, "3", EOL, "4", EOL, "5", EOL)) {
            for (String num : nums) {
                println(num);
            }
        }
    }
    
    void testLinkedList() {
        List<Integer> numbers = new LinkedList<Integer>();
        
        boolean pass = false;
        try {
            println(numbers.get(0));
        } catch (IndexOutOfBoundsException ex) {
            pass = true;
        }
        assert pass == true;
        
        numbers.add(9);
        numbers.add(13);
        numbers.add(16);
        numbers.add(18);

        assert numbers.get(numbers.size()-1).equals(18);
        
        int[] a = new int[4];
        a[0] = 9;
        a[1] = 10;
        a[2] = 11;
        assert (a[0] == 9);
        assert (a[1] == 10);
        assert (a[2] == 11);
    }

    void testCollection() {
        Collection<Integer> nums = new LinkedList<Integer>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(7);

        assert nums.contains(3) == true;

        nums.remove(3);

        assert nums.contains(3) == false;

        try (Close out = outExpect(1, EOL, 5, EOL, 7, EOL)) {
            Iterator<Integer> i = nums.iterator();
            while (i.hasNext()) {
                Integer value = i.next();
                println(value);
            }
        }

        try (Close out = outExpect(1, EOL, 5, EOL, 7, EOL)) {
            for (Integer value : nums) {
                println(value);
            }
        }
    }
    
}
