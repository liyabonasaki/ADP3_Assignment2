import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class SetClass  {

    Set <String> StudentNames = new HashSet<String>(5);

    public void add(){
        StudentNames.add("Jon");
        StudentNames.add("Liyabona");
        StudentNames.add("Saski");

        System.out.println(StudentNames);
    }

    public void remove(String object){
        StudentNames.remove(object);
        System.out.println(StudentNames);
    }

    public void find(String object){
        StudentNames.contains(object);
        System.out.println(StudentNames);
    }



}
