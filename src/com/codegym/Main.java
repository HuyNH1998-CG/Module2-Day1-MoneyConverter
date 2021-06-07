package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double rates = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 to convert USD to VND and 2 for otherwise");
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> {
                System.out.println("Input the USD amount to convert:");
                double USD = scanner.nextInt();
                double VND = USD * rates;
                System.out.println(USD + " USD equal to " + VND + "VND");
            }
            case 2 -> {
                System.out.println("Input the VND amount to convert");
                double VND = scanner.nextInt();
                double USD = VND / 23000;
                System.out.println(VND + " VND equal to " + USD + "USD");
            }
        }
    }
}
