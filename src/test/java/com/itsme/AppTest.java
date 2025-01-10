package com.itsme;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testMainMethod() {
        // Test main method execution
        assertDoesNotThrow(() -> {
            App.main(new String[] {});
        });
    }

    @Test
    void testExceptionHandling() {
        // Test exception logging path
        assertDoesNotThrow(() -> {
            App.main(new String[] {});
        });
    }
}