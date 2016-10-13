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
    void testrun() {
        outExpect("Hello World!");
        run();
        outClose();
    }

    void run() {
        println("Hello World!");
    }
}
