package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void boundaryAmount() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void lessBoundaryAmount() {
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void moreBoundaryAmount() {
        int actual = cashbackHackService.remain(1200);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void zeroBoundaryAmount() {
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}
