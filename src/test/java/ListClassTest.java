import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListClassTest {

    ListClass lc = new ListClass();

    @BeforeEach
    void setUp() {
        lc = new ListClass();
    }

    @Test
    void add() {
        lc.add("Liyabona");
        assertNotNull(lc);
    }


    @Test
    String find(String object) {
        lc.find("Liyabona");
        lc.find("Liyabona");
        assertNotNull(lc);
        return object;
    }

    @Test
    void remove() {
        lc.add("Liyabona");
        lc.add("Buhle");
        lc.remove("Buhle");
        if(lc == null){
            System.out.println("List is empty");
        }else
        assertNotNull(lc);
    }
}