package com.itsme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        log.debug("Debug message - only shows in dev profile");
        log.info("Info message - shows in both profiles");
        log.error("Error message - goes to error.log");
    }
}
