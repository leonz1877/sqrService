package ru.netology.sqr;

public class SQRService {


    public int sqrCount(int bottomBorder, int upperBorder) {

        int count = 0;
        for (int i = 10; i < 100; i++) {
           if (i * i >= bottomBorder && i * i <= upperBorder) {
               count = count + 1;
           }
        }
       return count;
    }
}