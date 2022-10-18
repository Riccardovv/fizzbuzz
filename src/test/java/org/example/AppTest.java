package org.example;

import junit.framework.TestCase;


public class AppTest extends TestCase {

    public void testOn() {
        Lights luces = new Lights();

        luces.turnOn(0, 0, 0, 0);
        assertTrue(luces.get(0, 0));

        luces.turnOn(10, 10, 10, 10);
        assertTrue(luces.get(0,  0));

        luces.toggle(0, 0, 0, 0);
        assertFalse(luces.get(0,  0));

        luces.turnOn(999, 999, 0, 0);
        assertTrue(luces.Get(10,  0));

        luces.toggle(999, 999, 999, 999);
        assertFalse(luces.get(999, 0));


    }
}
