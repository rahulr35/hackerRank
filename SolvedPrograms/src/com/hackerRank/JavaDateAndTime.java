package com.hackerRank;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class JavaDateAndTime {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int day = Integer.parseInt(firstMultipleInput[0]);
        int month = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        //bufferedWriter.write(res);
        //bufferedWriter.newLine();
        bufferedReader.close();
        //bufferedWriter.close();
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int d = cal.get(Calendar.DAY_OF_WEEK);
        String dayOfWeek = getDayOfWeek(d);
        System.out.println(dayOfWeek);
        return dayOfWeek;
    }

    public static String getDayOfWeek(int dayOfWeek){
        String a[] = new String []{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", };
        List<String> daysofWeek = Arrays.asList(a);
        return daysofWeek.get(dayOfWeek-1).toUpperCase();
    }
}
