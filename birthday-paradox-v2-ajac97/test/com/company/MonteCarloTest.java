package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MonteCarloTest {
    MonteCarlo instance = new MonteCarlo();

    @Test
    void numberOfDuplicatesEmptyList() {
        List<Integer> list = new ArrayList<>();
        int actual = instance.numberOfDuplicates(list);
        assertEquals(0, actual);
    }

    @Test
    void numberOfDuplicatesNone() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 5, 7));
        int actual = instance.numberOfDuplicates(list);
        assertEquals(0, actual);
    }

    @Test
    void numberOfDuplicatesAll() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.addAll(Arrays.asList(3, 3, 3, 3));
        int actual = instance.numberOfDuplicates(list);
        assertEquals(4, actual);
    }
}