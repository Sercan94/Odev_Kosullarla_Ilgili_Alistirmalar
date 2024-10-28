package com.sercan;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        /**
         * Bir öğrencinin notunu (0-100 arası)
         * kullanıcıdan alın ve 50’den büyükse “Geçti”, küçükse “Kaldı” şeklinde sonuç yazdırın.
         *
         */
        System.out.print("Lütfen notunuzu giriniz (0-100) : ");
        int sayi=new Scanner(System.in).nextInt();
        if (sayi>50){
            System.out.println("Geçti");
        }else System.out.println("Kaldı");
    }
}
