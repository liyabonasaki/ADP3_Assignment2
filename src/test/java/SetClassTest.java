import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetClassTest {

    SetClass sc = new SetClass();

    @BeforeEach
    void setUp() {
        sc = new SetClass();

    }

    @Test
    void add() {
        sc.add("Test");
        sc.add("Test");

        assertNotNull(sc);
        System.out.println(sc);
    }

    @Test
    void remove() {
        sc.remove("Liyabona");
        assertNotNull(sc);
        System.out.println(sc);

    }

    @Test
    void find() {
        sc.find("Liyabona");
        assertNotNull(sc);
        System.out.println(sc);
    }
}