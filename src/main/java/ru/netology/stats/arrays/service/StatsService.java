package ru.netology.stats.arrays.service;

public class StatsService {

    public int getSumSales(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public double getAverSales(int[] sales) {
        double averSales = 0;
        if (sales.length > 0) {
            double sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            averSales = sum / sales.length;
        }
        return averSales;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getQtyBelowAverSales(int[] sales) {
        int qty = 0;
        double aver = getAverSales(sales);
        for (int sale : sales) {
            if (sale < aver) {
                qty += 1;
            }
        }
        return qty;
    }

    public int getQtyHigherAverSales(int[] sales) {
        int qty = 0;
        double aver = getAverSales(sales);
        for (int sale : sales) {
            if (sale > aver) {
                qty += 1;
            }
        }
        return qty;
    }
}


