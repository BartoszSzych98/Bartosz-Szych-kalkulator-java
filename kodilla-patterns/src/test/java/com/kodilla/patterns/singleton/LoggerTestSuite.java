package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openLogger() {
        logger = Logger.INSTANCE;
        logger.log("first log");
    }
    @Test
    void testGetLastLog() {
        //Given
        //When
        //Then
        assertEquals("first log", logger.getLastLog());
    }
}