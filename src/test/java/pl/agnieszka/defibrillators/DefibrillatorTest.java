package pl.agnieszka.defibrillators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefibrillatorTest {

    @Test
    void createDefibrillator() {

        String description = "1;A;B;C;1,1;2,2";
        Defibrillator defibrillator = Defibrillator.createDefibrillator(description);
        
        assertEquals(1, defibrillator.getNumber());
        assertEquals("A", defibrillator.getName());
        assertEquals("B", defibrillator.getAddres());
        assertEquals("C", defibrillator.getPhoneNumber());
        assertEquals(new Point(1.1, 2.2), defibrillator.getLocation());

    }
}