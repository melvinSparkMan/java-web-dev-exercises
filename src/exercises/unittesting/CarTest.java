package exercises.unittesting;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    Car first_toyota;
    @Before
    public void createCarObject() {
        first_toyota = new Car("Toyota", "Prius", 10, 50);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testGasTankInitial() {
        assertEquals(10, first_toyota.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        first_toyota.drive(50);
        assertEquals(9, first_toyota.getGasTankLevel(), 0.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        first_toyota.drive(550);
        assertEquals(10, first_toyota.getGasTankLevel(), 0.001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        first_toyota.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");

    }

}
