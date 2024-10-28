package com.sercan;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir ay ismi alın
         * ve o ayın kaç gün çektiğini ekrana yazdıran bir program yazın (şubat için 28 varsayılabilir).
         *
         */
        String ay ;
        //String cıkıs="0";
        Scanner scanner=new Scanner(System.in);
        //do {
            System.out.print("Lütfen bir ay ismi yazınız : ");
            ay=scanner.nextLine();
            switch (ay.trim().toLowerCase()){
                case "ocak":
                    System.out.println("Ocak ayı 31 gündür.");break;
                case "şubat":
                    System.out.println("Şubat ayı 28 gündür.");break;
                case"mart":
                    System.out.println("Mart ayı 31 gündür.");break;
                case "nisan":
                    System.out.println("Nisan ayı 30 gündür.");break;
                case"mayıs":
                    System.out.println("Mayıs ayı 31 gündür.");break;
                case"haziran":
                    System.out.println("Haziran ayı 30 gündür.");break;
                case"temmuz":
                    System.out.println("Temmuz ayı 31 gündür.");break;
                case"ağustos":
                    System.out.println("Ağustos ayı 31 gündür.");break;
                case"eylül":
                    System.out.println("Eylül ayı 30 gündür.");break;
                case"ekim":
                    System.out.println("Ekim ayı 31 gündür.");break;
                case"kasım":
                    System.out.println("Kasım ayı 30 gündür.");break;
                case"aralık":
                    System.out.println("Aralık ayı 31 gündür.");break;
                default:
                    System.out.println("Lütfen bir ay ismi giriniz!!!");
            }
        //}while (ay!="cıkış"); //Döngü denedim ama çıkış yaptıramadım.



        


    }
}
