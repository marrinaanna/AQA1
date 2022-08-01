package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCashbackHackService {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnAddAmountLessBoundary() {
        int actual = service.remain(900);
        assertEquals(actual, 100);
    }

    @Test
    public void shouldReturnAmount() {
        int actual = service.remain(0);
        assertEquals(actual, 1000);
    }

    @Test
    public void shouldNotReturnAddAmount() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldReturnAddAmountOverBoundary() {
        assertEquals(service.remain(1100), 900);
    }
}