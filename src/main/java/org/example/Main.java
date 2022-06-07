package org.example;

public class Main {
    static int myInt(int x, int y){
        return x+ y;
    }
    static double myInt(double p, double q){
        return p*q;
    }
    static String myInt(String K,  String l){

        return l;

    }

    public static void main(String[] args) {
        System.out.println(myInt(5,3));
        System.out.println(myInt(2.11,3.44));
        System.out.println(myInt("money","lover"));

    }
}