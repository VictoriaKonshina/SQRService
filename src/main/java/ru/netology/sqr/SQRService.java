package ru.netology.sqr;
public class SQRService {
    public int calc(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= min) {
                if (iSquare <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}