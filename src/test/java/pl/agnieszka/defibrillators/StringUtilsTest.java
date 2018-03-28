package pl.agnieszka.defibrillators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void toDouble() {

        String str = "178,94";
        double result = StringUtils.toDouble(str);

        assertEquals(178.94, result);
    }

}