package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long averageSum(long[] purchases) {
        long sum = calculateSum(purchases);
        return sum / 12;
    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public long findMin(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }

    public long monthsBelowAverageSum(long[] purchases) {
        long currentBelowAvarage = purchases[0];
        for (long purchase : purchases) {
            if (currentBelowAvarage < averageSum(purchases)) {
                currentBelowAvarage = purchase;
            }
        }
        return currentBelowAvarage;
    }

    public long monthsAboveAverageSum(long[] purchases) {
        long currentAboveAvarage = purchases[0];
        for (long purchase : purchases) {
            if (currentAboveAvarage > averageSum(purchases)) {
                currentAboveAvarage = purchase;
            }
        }
        return currentAboveAvarage;
    }

}
