import org.junit.*;

import static org.junit.Assert.*;

public class WagonTest {
    Wagon w;

    @Before
    public void setUp () {
        w = new Wagon(50, 3);
    }

    @Test(timeout = 50)
    public void testGetSpeed() {
        assertEquals(0, w.getSpeed());
    }

    @Test(timeout = 50)
    public void testGetMaxSpeed() {
        assertEquals(3, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void testUpgradeSpeed() {
        w.upgradeSpeed();
        assertEquals(4, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void testDowngradeSpeed() {
        w.downgradeSpeed();
        assertEquals(3, w.getMaxSpeed());
    }

}
