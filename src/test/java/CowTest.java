import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow();
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(28, c.getPrice());
    }
}