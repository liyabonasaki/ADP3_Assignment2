import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MapClassTest {

    MapClass mc = new MapClass();

    @BeforeEach
    void setUp() {
        mc = new MapClass();
    }

    @Test
    void add() {
        mc.add(0,"Liyabona");
        mc.add(1,"Saki");
        mc.add(2,"kusie");
        assertNotNull(mc);

    }

    @Test
    void remove() {
        mc.add(0,"Liyabona");
        mc.add(1,"Saki");
        mc.add(2,"kusie");
        //remove index 2
        mc.remove(2);
        assertNotNull(mc);

    }

    @Test
    @Timeout(5)
    void find() throws InterruptedException {
        //Throws exception when no response after 3 seconds
        TimeUnit.SECONDS.sleep(3);
        mc.add(0,"Liyabona");
        mc.add(1,"master");
        mc.find("master");

        System.out.println(mc);
        assertNotNull(mc);
    }
}