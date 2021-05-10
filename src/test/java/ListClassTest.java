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
        lc.add("master");
        assertNotNull(lc);
    }


    @Test
    void find() {
        lc.add("Liyabona");
        lc.add("master");
        lc.find("master");
        System.out.println(lc);
        assertNotNull(lc);
    }

    @Test
    void remove() {
        lc.add("Liyabona");
        lc.add("Buhle");
        lc.remove("Buhle");
        if(lc == null){
            System.out.println("List is empty");
            assertNull(lc);
        }else
        assertNotNull(lc);
    }
}