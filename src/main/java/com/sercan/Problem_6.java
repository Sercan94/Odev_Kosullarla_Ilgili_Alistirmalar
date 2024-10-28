package com.sercan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir tamsayı alın ve bu sayının çift mi, tek mi olduğunu belirleyin.
         *
         */
        System.out.print("Lütfen bir tamsayi giriniz : ");
        int sayi=new Scanner(System.in).nextInt();
        if (sayi%2==0){
            System.out.println("Girilen sayi çifttir.");
        }else {
            System.out.println("Girilen sayi tektir.");
        }
    }
}