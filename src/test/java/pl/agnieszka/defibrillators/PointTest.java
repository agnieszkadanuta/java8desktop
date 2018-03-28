package pl.agnieszka.defibrillators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    //deklarujemy stan systemu testowego; korzystamy z zadeklarowanego obiektu

    private Point zeroPoint;

    @BeforeEach
    void setUp(){
        zeroPoint = new Point(0,0);

    }


    @Test
    void distanceTo() {

        Point b = new Point(100.0, 100.0);

        double x = (100 - 0) * Math.cos((0 + 100) / 2);
        double y = (100 - 0);
        double d = Math.sqrt((x * x) + (y * y)) * 6371;

        double result = zeroPoint.distanceTo(b);

        assertEquals(d, result);

    }

    @Test
    void distanceToItself(){

        Point b = zeroPoint;

        double result = zeroPoint.distanceTo(b);
        assertEquals(0.0, result);
    }
}