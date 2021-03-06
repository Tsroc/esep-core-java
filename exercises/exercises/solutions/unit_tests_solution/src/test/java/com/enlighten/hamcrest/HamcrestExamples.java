package com.enlighten.hamcrest;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class HamcrestExamples {
    @Test
    public void verifyAllConditionsUsingHamcrest(){
        assertThat("test", anyOf(is("testing")));
        assertThat("test", containsString("testing"));
        assertThat("test", not(containsString("testing")));
    }
    @Test
    public void listShouldInitiallyBeEmpty() {
        List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, hasSize(3));

        // ensure the order is correct
        assertThat(list, contains( 5, 2, 4));

        assertThat(list, containsInAnyOrder(2, 4, 5));

        assertThat(list, everyItem(greaterThan(1)));

    }
}
