import java.util.ArrayList;
import java.util.List;

public class ListClass {
    //List


    List StudentNames = new ArrayList();

    public void add(){
        StudentNames.add(0,"Amahle");
        StudentNames.add(1,"Liyabona");
        StudentNames.add(2,"Jon");
        StudentNames.add(3,"Suski");

        System.out.println(StudentNames);

    }


    public void remove(){
        StudentNames.remove(2);
    }
}
