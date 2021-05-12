/*
Liyabona Saki
217120830
 */

package za.ac.cput.adp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.adp3.CollectionsClass;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsClassTest {

    private CollectionsClass cc;

    @BeforeEach
    void setUp() {
        cc = new CollectionsClass();
    }

    @Test
    void add() {
        cc.add("Liyabona");
        cc.add("Susie");
        assertNotNull(cc);
        System.out.println(cc);
    }

    @Test
    void remove() {
        cc.add("Liyabona");
        cc.add("Susie");
        cc.remove("Susie");
        if(cc == null){
            System.out.println("List is empty");
            assertNull(cc);
        }else
            assertNotNull(cc);
    }

    @Test
    void find() {
        cc.add("Liyabona");
        cc.add("master");
        cc.find("master");
        System.out.println(cc);
        assertNotNull(cc);
    }
}