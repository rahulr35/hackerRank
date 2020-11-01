package com.hackerRank;

import java.util.Scanner;

public class JavaRegex{



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            new MyRegex();
			System.out.println(IP.matches(MyRegex.pattern));
           // getStringPattern();
        }
    }
}