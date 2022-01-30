package exercises.technology;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class TDD {
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    Computer LapTop = new Computer( "QualComm SnapDragon", 16.0, "802.11bgn");
    @Test
    public void testForCPU() {
        assertEquals("QualComm", Desktop.getDesktop());
    }
}
