package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void testSum() {
        assertEquals(5, Main.sum(2, 3));
    }
}

