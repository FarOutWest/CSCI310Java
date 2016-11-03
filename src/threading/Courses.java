import java.util.*;

/**
 * @author West
 */
public class Courses {
    private LinkedList<String> data = new LinkedList<String>();
    
    public synchronized void addCourse(String course) {
        data.add(course);
    }
    
    public synchronized List<String>  getCourses() {
        return new ArrayList<String>(data);
    }
}
