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
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int findMinAverage(int[] sales) {
        int average = findAverage(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale <= average) {
                month ++;
            }
        }
        return month;
    }

    public int findMoreAverage(int[] sales) {
        int average = findAverage(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale >= average) {
                month ++;
            }
        }
        return month;
    }
}

