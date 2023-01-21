package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        double b = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + i;
            b = b + numbers[i];
        }

        //When
        double actualAvg = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(b / numbers.length, actualAvg, 0);
    }
}