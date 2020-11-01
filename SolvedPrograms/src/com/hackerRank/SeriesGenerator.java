package com.hackerRank;

import java.util.Scanner;

public class SeriesGenerator {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            getValue(a, b, n);
            System.out.print("\n");
        }
        in.close();
    }

    public static int getValue(int a, int b, int n){
        int sum = 0;
        for (int i = 0 ; i < n; i++){
            if (i == 0) {
                sum = a + 0;
            }
            sum = power(2, i)*b + sum;
            System.out.print(sum + " ");
        }
        return sum;
    }

    public static int power(int a, int b){
        int pValue = 1;
        for(int i = 1;i <= b; i++ ){
            pValue = pValue*a;
        }
        return pValue;
    }


}