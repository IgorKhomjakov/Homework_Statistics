package ru.netology.stats.arrays.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 35, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 200;
        int actual = service.getSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 35, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 16;
        int actual = (int) service.getAverSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 35, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.getMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 35, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 2;
        int actual = service.getMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQtySalesBelowAver() {
        StatsService service = new StatsService();
        int[] sales = {8, 35, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.getQtyBelowAverSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQtySalesHigherAver() {
        StatsService service = new StatsService();
        int[] sales = {8, 35, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.getQtyHigherAverSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
