package ru.netilogy.sqr.services;

public class SQRService {
    public int numSqr(int min, int max) {
        int j = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                j = j + 1;
            }
        }
        return j;
    }
}
