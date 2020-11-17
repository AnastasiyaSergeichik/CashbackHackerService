package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {
    CashbackHackerService cashbackHackerService = new CashbackHackerService();

    @Test
    public void boundaryAmount() {
        int actual = cashbackHackerService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void lessBoundaryAmount() {
        int actual = cashbackHackerService.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void moreBoundaryAmount() {
        int actual = cashbackHackerService.remain(1200);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void zeroBoundaryAmount() {
        int actual = cashbackHackerService.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}
