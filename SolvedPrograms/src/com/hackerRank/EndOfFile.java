package com.hackerRank;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = 0;
        try {
            while (s != null) {
                System.out.println((++a) + " " + s);
                s = scanner.nextLine();
            }

        } catch (Exception e) {
            scanner.close();
        }
    }
}
