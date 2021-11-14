package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 181;

        int actual = service.calculateSum(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 151;

        int actual = service.findAverage(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 201;

        int actual = service.findMaxSale(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 71;

        int actual = service.findMinSale(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthMinAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 51;

        int actual = service.findMinAverage(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthMoreAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 51;

        int actual = service.findMoreAverage(managerSales);

        assertEquals(expected, actual);
    }


    }
