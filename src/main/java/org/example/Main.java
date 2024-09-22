package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        fizz(500);
        reversedLine("makeinstall");
        equation(1,4,3);
        sum();
    }

    //Первое задание
    public static ArrayList <String> fizz (int n){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            if (i % 5 == 0 && i % 7 == 0) {
                list.add("fizzbuzz");
            }
            else if (i % 7 == 0) {
                list.add("buzz");
            }
            else if (i % 5 == 0) {
                list.add("fizz");
            }
            else list.add(Integer.toString(i));
        }
        System.out.println(list);
        return list;
    }
    //Второе задание
    public static String reversedLine(String initialLine) {
        StringBuilder reversedLine = new StringBuilder();
        for (int i = initialLine.length() - 1; i >= 0; --i) {
            reversedLine.append(initialLine.charAt(i));
        }
        System.out.println(reversedLine);
        return reversedLine.toString();
    }
    //Третье задание
    public static ArrayList <String> equation (double a, double b, double c) {
        double x1, x2;
        ArrayList<String> list = new ArrayList<>();
        double d = b * b - 4 * a * c;
        float eps = 1e-6f;

        if (Math.abs(d) < eps) {
            x1 = -b / 2 / a;
            list.add(String.valueOf(x1));

        } else if (d >= eps) {
            x1 = (-b + (float) Math.sqrt(d)) / 2 / a;
            x2 = (-b - (float) Math.sqrt(d)) / 2 / a;
            list.add(String.valueOf(x1));
            list.add(String.valueOf(x2));
        } else {
            list.add("Нет вещественных корней");
        }
        System.out.println(list);
        return list;
    }
    //Четвертое задание
    public static double sum (){
        double sum = 0, b;
        int n = 2;
        do {
            b = 1.0 / (n * n + n - 2);
            sum += b;
            n++;
        } while (b >= 1e-6);
        System.out.println(sum);
        System.out.println(b);
        return sum;
    }

    //Пятое задание
    public static boolean palindrome(String line) {
        line = line.toLowerCase();
        StringBuilder line2 = new StringBuilder();
        for (int i = 0; i < line.length(); ++i) {
            if (Character.isLetter(line.charAt(i))) {
                line2.append(line.charAt(i));
            }
        }
        int n = line2.length();
        for (int i = 0; i < n / 2; ++i) {
            if (line2.charAt(i) != line2.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}