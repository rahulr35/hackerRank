package com.hackerRank;

import java.util.Scanner;

public class StaticBlockIntialiser {

    private static final Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    private static boolean flag;

    static {
        if (B < 0 || H < 0 || B == 0 || H == 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args){
        if(flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}

