import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class SetClass  {

    Set <String> StudentNames = new HashSet<String>();

    public void add(String name){
        System.out.println("============= Add Here -> ==============");
        StudentNames.add(name);
        System.out.println(StudentNames);
    }

    public void remove(String object){
        System.out.println("============= Remove Here -> ==============");
        StudentNames.remove(object);
        System.out.println(StudentNames);
    }

    public String find(String object){
        System.out.println("============= Search Here -> ==============");
        StudentNames.contains(object);
        System.out.println(StudentNames);
        return object;
    }


}
