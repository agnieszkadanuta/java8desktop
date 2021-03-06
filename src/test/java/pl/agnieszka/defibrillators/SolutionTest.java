package pl.agnieszka.defibrillators;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findNearest() {
        User user = new User (new Point(0,0));
        Defibrillator def1 = Defibrillator.createDefibrillator("1;A;B;C;0;10");
        Defibrillator def2 = Defibrillator.createDefibrillator("2;ju;lek;ty;0;20");
        Defibrillator def3 = Defibrillator.createDefibrillator("3;ko;ti;rok;0;30");

        List<Defibrillator> defibrillators = new ArrayList<>();
        defibrillators.add(def1);
        defibrillators.add(def2);
        defibrillators.add(def3);

        Defibrillator actual = Solution.findNearest(user, defibrillators);

        assertEquals(def1, actual);
    }
}