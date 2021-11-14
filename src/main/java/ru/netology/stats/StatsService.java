package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int findAverage(int[] sales) {
        return calculateSum(sales) / sales.length;

    }

    public int findMaxSale(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int findMinSale(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int findMinAverage(int[] sales) {
        int average = findAverage(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month ++;
            }
        }
        return month;
    }

    public int findMoreAverage(int[] sales) {
        int average = findAverage(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month ++;
            }
        }
        return month;
    }
}

