package com.enlighten.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.MonthDay;
import java.util.stream.Stream;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class Junit5AssertionExampleTests {


        @Test
        void standardAssertions() {
            assertEquals(2, 2);
            assertEquals(4, 4, "The optional assertion message is now the last parameter.");
            assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
                    + "to avoid constructing complex messages unnecessarily.");
        }

        @Test
        void groupedAssertions() {
            // In a grouped assertion all assertions are executed, and any
            // failures will be reported together.

            Person person = new Person("John","Doe");
            assertAll("person",
                    () -> assertEquals("John", person.getFirstName()),
                    () -> assertEquals("Doe", person.getLastName())
            );
        }

        @Test
        void dependentAssertions() {
            // Within a code block, if an assertion fails the
            // subsequent code in the same block will be skipped.
            Person person = new Person("John","Doe");
            assertAll("properties",
                    () -> {
                        String firstName = person.getFirstName();
                        assertNotNull(firstName);

                        // Executed only if the previous assertion is valid.
                        assertAll("first name",
                                () -> assertTrue(firstName.startsWith("J")),
                                () -> assertTrue(firstName.endsWith("n"))
                        );
                    },
                    () -> {
                        // Grouped assertion, so processed independently
                        // of results of first name assertions.
                        String lastName = person.getLastName();
                        assertNotNull(lastName);

                        // Executed only if the previous assertion is valid.
                        assertAll("last name",
                                () -> assertTrue(lastName.startsWith("D")),
                                () -> assertTrue(lastName.endsWith("e"))
                        );
                    }
            );
        }

        @Test
        void exceptionTesting() {
            Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
                throw new IllegalArgumentException("a message");
            });
            assertEquals("a message", exception.getMessage());
        }

        @Test
        void timeoutNotExceeded() {
            // The following assertion succeeds.
            assertTimeout(ofMinutes(2), () -> {
                // Perform task that takes less than 2 minutes.
            });
        }

        @Test
        void timeoutNotExceededWithResult() {
            // The following assertion succeeds, and returns the supplied object.
            String actualResult = assertTimeout(ofMinutes(2), () -> {
                return "a result";
            });
            assertEquals("a result", actualResult);
        }

        @Test
        void timeoutNotExceededWithMethod() {
            // The following assertion invokes a method reference and returns an object.
            String actualGreeting = assertTimeout(ofMinutes(2), Junit5AssertionExampleTests::greeting);
            assertEquals("Hello, World!", actualGreeting);
        }

        @Test
        void timeoutExceeded() {
            // The following assertion fails with an error message similar to:
            // execution exceeded timeout of 10 ms by 91 ms
            assertTimeout(ofMillis(10), () -> {
                // Simulate task that takes more than 10 ms.
                Thread.sleep(100);
            });
        }

        @Test
        void timeoutExceededWithPreemptiveTermination() {
            // The following assertion fails with an error message similar to:
            // execution timed out after 10 ms
            assertTimeoutPreemptively(ofMillis(10), () -> {
                // Simulate task that takes more than 10 ms.
                Thread.sleep(100);
            });
        }


    @ParameterizedTest(name = " numberProducts: {1} => should return {0}")
    @MethodSource("serviceTestData")
    void verifyDeliveryServiceCostsInSummer(double expectedPrice, int numberProducts){
        DeliveryService deliveryService = new DeliveryService();
        assertThat(expectedPrice, is(deliveryService.calculateDeliveryCosts(numberProducts)));
    }

    private static Stream<Arguments> serviceTestData(){
        return Stream.of(
                Arguments.of(100,10),
                Arguments.of(200,20),
                Arguments.of(990,99)
        );
    }

        private static String greeting() {
            return "Hello, World!";
        }


}
