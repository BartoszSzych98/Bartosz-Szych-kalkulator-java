package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {



        @Test
        public void testBigMac() {
            // Given
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .bun("seasam")
                    .burgers(1)
                    .sauce("barbecue")
                    .ingredients("salad")
                    .ingredients("becon")
                    .build();
            System.out.println(bigmac);

            // When
            int howManyIngridients = bigmac.getIngredients().size();

            // Then
            assertEquals(2, howManyIngridients);
        }
    }
