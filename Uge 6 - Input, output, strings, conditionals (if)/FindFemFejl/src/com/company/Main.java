package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1,6);
        System.out.println(randomNumber);

        int count = 0;
        System.out.println(++count);

        double count2 = 5;
        if (count2 >= 10) {
            System.out.println("Tal er større eller lig med 10");
    }

        double number1 = 50;
        double number2 = 7;
        double resultat = number1 / number2;
        if (resultat > 7) {
            System.out.println("Resultat større end 7");
        }

        int number3 = 10;
        if (number3 == 10) {
            System.out.println("Variablen number indeholder værdien 10");
        }
}}
