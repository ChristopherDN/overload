package com.company;

public class Main {

    public static void out(String str){
        System.out.println(str);
    }
    public static void out(int str){
        System.out.println(str);
    }
    public static void out(boolean ii){
        System.out.println(ii);
    }
    public static void out(Integer ii){
        out(ii.equals("18"));
    }

    public static void main(String[] args) {
        // write your code here
        // System.out.println("Hej");
        out("hej");
        out(2);
        Integer i1 = Integer.valueOf(17);
        i1++;
        out(i1);
        Integer iii = 1;
        int n = 0;

        out('a');
        for (int p = 1500; p < 1600; p++) {
            out("" + (char) (p) + " har ascii" + p);
            n++;
        }

        for (int p = 26350; p < 26450; p++) {
            out("" + (char) (p) + " har ascii" + p);
            n++;
        }
        out("" + (char)65021);
    }
    }
