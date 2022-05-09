package Exercice1;

import Exercice1.EPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWolf {

    Wolf wolf = new Wolf();

    @Test
    public void testInitialPosition() {
        Assertions.assertEquals( wolf.position, EPosition.NORD );
    }

    @Test
    public void testCircularity() {
        System.out.println(wolf.position);
        wolf.next();
        System.out.println(wolf.position);
        Assertions.assertEquals( wolf.position, EPosition.EST );
        wolf.next();
        Assertions.assertEquals( wolf.position, EPosition.SUD );
        wolf.next();
        Assertions.assertEquals( wolf.position, EPosition.OUEST );
        wolf.next();
        Assertions.assertEquals( wolf.position, EPosition.NORD );
    }
}
