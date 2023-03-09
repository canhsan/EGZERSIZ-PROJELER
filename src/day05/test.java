package day05;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi>0){
            if (sayi%2==0){
                if (sayi%10==0){
                    System.out.println("Girilen sayi :"+sayi+" pozitif 10'un katidir");
                }else {
                    System.out.println("Girilen sayi :" + sayi + " pozitif cift sayidir, 10'un kati değildir");
                }
            }else {
                System.out.println("Girilen sayi :"+sayi+" pozitif tek sayidir");
            }

        } else if (sayi<0) {
            if (sayi%2==0){
                if (sayi%10==0){
                    System.out.println("Girilen sayi :"+sayi+" negatif 10'un katidir");
                }else {
                    System.out.println("Girilen sayi :" + sayi + " negatif cift sayidir,10'un kati değildir");
                }
            }else {
                System.out.println("Girilen sayi :"+sayi+" negatif tek sayidir");
            }

        }else {
            System.out.println("Gecersiz giris");
        }

    }

    }

