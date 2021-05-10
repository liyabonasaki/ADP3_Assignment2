import java.util.HashMap;
import java.util.Map;

public class MapClass {


    HashMap<Integer, String> studentNames = new HashMap<Integer, String>();

    public void add(int index,String value){
        System.out.println("============= Add Here -> ==============");
        studentNames.put(index,value);
        System.out.println(studentNames);

    }

    public void remove(int key){
        System.out.println("============= Remove Here -> ==============");
        String returned_value = (String)studentNames.remove(key);
        System.out.println("Removing object.....");
        System.out.println(studentNames);

    }

    public String find(String value){
        System.out.println("============= Search Here -> ==============");

            System.out.println("Searching.....");
            if(studentNames.containsValue(value)){
                System.out.println(value);
            }else{
                System.out.println("Cant find ");
            }
        return value;
    }

}

