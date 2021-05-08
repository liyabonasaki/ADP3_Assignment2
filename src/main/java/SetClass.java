import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class SetClass  {

    Set <String> StudentNames = new HashSet<String>(5);

    public void add(String name){
        StudentNames.add(name);
        System.out.println(StudentNames);
    }

    public void remove(String object){
        StudentNames.remove(object);
        System.out.println(StudentNames);
    }

    public String find(String object){
        StudentNames.contains(object);
        System.out.println(StudentNames);
        return object;
    }


}
