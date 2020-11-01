package com.hackerRank;

import java.util.Scanner;

public class Loops {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(N + " x " + i + " = " + (i*N));
        }

        scanner.close();
    }
}
