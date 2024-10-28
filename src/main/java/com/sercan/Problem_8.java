package com.sercan;

import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan doğum yılını alın ve 18 yaşından büyük olup olmadığını kontrol edin.
         * Büyükse "Reşit", değilse "Reşit değil" yazdırın.
         *
         */
        System.out.print("Doğum yılınızı giriniz : ");
        short dogumYili=new Scanner(System.in).nextShort();
        short bugün=2024;
        if ((bugün-dogumYili)>18){  // 18 'den büyük istendiği için
            System.out.println("Reşitsiniz");
        }else System.out.println("Reşit değilsiniz");
    }
}
