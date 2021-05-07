import java.util.ArrayList;
import java.util.List;

public class ListClass {
    //List
    List StudentNames = new ArrayList();


    public void add(String object){
        StudentNames.add(object);
        System.out.println(StudentNames);

    }


    public void remove(String object){
        System.out.println("============= Remove Here -> ==============");
        StudentNames.remove(object);
        System.out.println("Removing object.....");
        System.out.println(StudentNames);
    }

    public String find(String object){
        System.out.println("============= Search Here -> ==============");
        if(StudentNames.contains(object)){
            System.out.println("Searching.....");
            System.out.println(object);
        }else{
            System.out.println("Cant find");
        }
        return object;
    }

}
