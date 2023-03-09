package day05;

import java.util.Scanner;

public class nerstedIf {
    public static void main(String[] args) {
        /*Kullanicidan bir sayi alin, sayi tek ise negatif veya pozitif tek sayi
        oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        yazdirin.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir negatif veya pozitif bir tam sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi > 0) {
            //System.out.println("Girilen say51ı pozitif bir sayıdır");
            if (sayi % 2 == 0) {
                //System.out.println("Girilen sayı çift bir sayıdır");
                if (sayi % 2 == 0 && sayi % 10 == 0) {
                    System.out.println("Girilen sayı 10'un katı bir sayıdır");
                } else {
                    System.out.println("Girilen sayı 10'un katı bir sayı değildir");
                }
            } else if (sayi % 2 != 0) {
                System.out.println("Girilen sayı tek bir sayıdır");

            }

        } else if (sayi < 0) {
            System.out.println("Girilen sayı negatif bir sayıdır");
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayı çift bir sayıdır");
                if (sayi % 2 == 0 && sayi % 10 == 0) {
                    System.out.println("Girilen sayı 10'un katı bir sayıdır");
                } else {
                    System.out.println("Girilen sayı 10'un katı bir sayı değildir");
                }
            } else if (sayi % 2 != 0) {
                System.out.println("Girilen sayı tek bir sayıdır");

            }

        } else {
            System.out.println("Girilen sayı yanlış bir sayıdır");
        }

    }
}
