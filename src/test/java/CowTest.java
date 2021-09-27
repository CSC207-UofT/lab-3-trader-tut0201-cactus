import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Moooo!", c.sound());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, c.getPrice());
    }

}
