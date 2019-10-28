package com.example.lab_8_travis_ci;

import org.junit.Test;

import static org.junit.Assert.*;

public class ActionsTest {
    @Test
    public void testAdd() {
        assertEquals(2, Actions.Add(1,1), 0.1);
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, Actions.Subtract(1, 2), 0.1);
    }
}
