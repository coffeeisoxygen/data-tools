package com.itsme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // Test all log levels
        log.trace("TRACE level message");
        log.debug("DEBUG level message");
        log.info("INFO level message");
        log.warn("WARN level message");
        log.error("ERROR level message");

        // Test exception logging
        try {
            throw new RuntimeException("Test exception");
        } catch (Exception e) {
            log.error("Error with exception", e);
        }
    }
}
