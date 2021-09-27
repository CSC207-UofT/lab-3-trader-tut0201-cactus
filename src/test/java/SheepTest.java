import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CowTest {
    Sheep s;

    @Before
    public void setUp() throws Exception {
        s = new Sheep();
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(28, s.getPrice());
    }
}