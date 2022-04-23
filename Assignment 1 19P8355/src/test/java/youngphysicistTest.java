import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhysicsTest {
    @Test
    void TC1() {
        var Phy = new Physics();
        int x[] = {2, 1, -3};
        int y[] = {2, 2, -4};
        int z[] = {3, 2, -5};
        assertTrue(Phy.Space(3, x, y, z));
    }

    @Test
    void TC2() {
        var phy = new Physics();
        int x[] = {2, 7};
        int y[] = {4, 9};
        int z[] = {-6, 6};
        assertFalse(phy.Space(2, x, y, z));
    }

    @Test
    void TC3() {
        var phy = new Physics();
        int x[] = {0};
        int y[] = {0};
        int z[] = {0};
        assertTrue(phy.Space(1, x, y, z));
    }

    @Test
    void TC4() {
        var phy = new Physics();
        int x[] = {2};
        int y[] = {2};
        int z[] = {2};
        assertThrows(IllegalArgumentException.class, () -> {
            phy.Space(0, x, y, z);
        });
    }
}