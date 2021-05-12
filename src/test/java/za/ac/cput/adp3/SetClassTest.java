/*
Liyabona Saki
217120830
 */

package za.ac.cput.adp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.adp3.SetClass;

import static org.junit.jupiter.api.Assertions.*;

class SetClassTest {

    private SetClass sc;

    @BeforeEach
    void setUp() {
        sc = new SetClass();

    }

    @Test
    void add() {
        sc.add("master");
        sc.add("Liyabona");

        assertNotNull(sc);
        System.out.println(sc);
    }

    @Test
    void remove() {
        sc.add("master");
        sc.add("Liyabona");
        sc.remove("Liyabona");
        assertNotNull(sc);
        System.out.println(sc);

    }

    @Test
    void find() {
        sc.add("master");
        sc.add("Liyabona");
        sc.find("Liyabona");
        assertNotNull(sc);
        System.out.println(sc);
    }
}