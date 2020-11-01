package com.hackerRank;

import java.util.Scanner;

public class FindDataType {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            String s1="";
            if(s.equals("0")||s.equals("1"))
                s1=s1+"boolean#";
            try{
                byte b=Byte.parseByte(s);
                s1=s1+"byte#";
            }
            catch(Exception e)
            {

            }
            try{
                short b1=Short.parseShort(s);
                s1=s1+"short#";
            }
            catch(Exception e)
            {

            }
            try{
                int j=Integer.parseInt(s);
                s1=s1+"int#";
            }
            catch(Exception e)
            {

            }
            try{
                long l=Long.parseLong(s);
                s1=s1+"long#";
            }
            catch(Exception e)
            {

            }
            if(!s1.equals(""))
            {
                System.out.println(s+" can be fitted in:");
                String s2[]=s1.split("#");
                for(int j=0;j<s2.length;j++)
                {
                    if(!s2[j].equals(""))
                        System.out.println("* "+s2[j]);
                }
            }
            else
                System.out.println(s+" can't be fitted anywhere.");
        }
    }
}