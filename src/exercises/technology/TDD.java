package exercises.technology;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class TDD {
    @Before
    Computer LapTop = new Computer( "QualComm SnapDragon", 16, "802.11bgn");
    @Test
    public void testForCPU() {
        assertEquals("QualComm", Computer.Desktop.setMicroprocessor("QualComm"));
    }
}
