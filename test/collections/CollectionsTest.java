package collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author West
 */
public class CollectionsTest {
    
    public CollectionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    public void testupdatefirst(LinkedList<String> list, String name) {
        assert list.get(0).equals(name);
    }
    
    public void testupdatelast(LinkedList<String> list, String name) {
        assert list.getLast().equals(name);
    }
    
    public void testremovefront (LinkedList<String> list) {
        String temp = list.get(0);
        assert !temp.equals(list.get(0));
    }
    
    public void testremoveback (LinkedList<String> list) {
        String temp = list.getLast();
        assert !temp.equals(list.getLast());
    }
    
    public void testaddindex(LinkedList<String> list, int num, String name) {
        assert list.get(num).equals(name);
    }
    
    public void testremoveindex(LinkedList<String> list, int num) {
        String temp = list.get(num);
        assert !list.get(num).equals(list.get(num));
    }
}
