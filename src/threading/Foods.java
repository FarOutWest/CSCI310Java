package threading;

import java.util.*;

/**
 * @author West
 */
public class Foods {
    private LinkedList<String> data = new LinkedList<String>();
    
    public synchronized void addFoods(String food) {
        data.add(food);
    }
    
    public synchronized List<String>  getFoods() {
        return new ArrayList<String>(data);
    }
}
