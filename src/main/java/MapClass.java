import java.util.HashMap;
import java.util.Map;

public class MapClass {

    Map studentNames = new HashMap();

    public void add(int index,String value){
        studentNames.put(0,"Susie");
        studentNames.put(1,"Liyabona");
        studentNames.put(2,"Jon");
        studentNames.put(3,"Memory");

        System.out.println(studentNames);

    }

    public void delete(String object){
        System.out.println("============= Remove Here -> ==============");
        studentNames.remove(object);
        System.out.println("Removing object.....");
        System.out.println(studentNames);
    }

    public String find(String value){
        System.out.println("============= Search Here -> ==============");
        try{
            studentNames.get(value);
            System.out.println("Searching.....");
            System.out.println(value);

        } catch (Exception e){
            System.out.println("Cannot find");
        }
        return value;
    }

}

