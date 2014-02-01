package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello_World");
        int [] drdrdr = new int[13];
        int n = 0;
        int f=0;
        int leng = 13;
//        Random r = new Random();
//        int t = r.nextInt();

        for (int i = 0; i<13; ++i){
            drdrdr[i] = (int) (1 + Math.random() * 100);
            System.out.println(drdrdr[i]);
        }
         System.out.println(" ");
        while (f < 13){
            if (drdrdr[f+1] < drdrdr[f]){
                if (drdrdr[f+1] > 0) {
                    n = drdrdr[f + 1];
                    drdrdr[f + 1] = drdrdr[f];
                    drdrdr[f] = n;
                    ++f;
               //     System.out.println("aaaa");
                }
            }else{
              f = 0;
             // System.out.println("bbbbb");
            }

        }

        for (int i = 0; i<13; ++i){
            System.out.println(drdrdr[i]);
        }
    }
}
