package com.hackerRank;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String o = String.format("%-15s", s1);
            String oOne = String.format("%03d", x);
            System.out.println(o + oOne);
        }
        System.out.println("================================");

    }
}
