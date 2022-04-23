import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterMelonTest {
    @Test
    void TC1() {
        var watermelon = new WaterMelon();
        assertTrue(watermelon.weight(22));
    }
    @Test
    void TC2() {
        var watermelon = new WaterMelon();
        assertFalse(watermelon.weight(5));
    }
    @Test
    void TC3() {
        var watermelon = new WaterMelon();
        assertFalse(watermelon.weight(2));
    }
    @Test
    void TC4() {
        var watermelon = new WaterMelon();
        assertFalse(watermelon.weight(-2));
    }

}