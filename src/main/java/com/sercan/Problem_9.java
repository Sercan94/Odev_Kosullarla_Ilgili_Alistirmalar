package com.sercan;

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        /**
         *  Kullanıcıdan üç sayı alın ve en büyüğünü ekrana yazdırın.
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int sayi=sc.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int sayi2=sc.nextInt();
        System.out.print("3. sayıyı giriniz : ");
        int sayi3=sc.nextInt();
        int enb=sayi;
        int enk=sayi;
        if (enb<sayi2) enb=sayi2;
        if (enb<sayi3)  enb=sayi3;
        if (enk>sayi2)  enk=sayi2;
        if (enk>sayi3)  enk=sayi3;
        System.out.println("En büyük sayi : "+enb);
        System.out.println("En küçük sayi : "+enk);



    }
}
