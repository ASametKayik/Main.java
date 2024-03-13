package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;
        String islemler = "1.İşlem :Bakiye Öğrenme\n"
                + "2.İşlem:Para Çekme\n"
                + "3.İşlem:Para Yatırma\n"
                + "4.İşlem:Çıkış İçin q'ya Basın";

        System.out.println("*********************");
        System.out.println(islemler);
        System.out.println("*********************");

        while (true) {
            System.out.print("Bir İşlem Seçiniz:");

            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor.");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz:" + bakiye);

            } else if (islem.equals("2")) {
                System.out.print("Çekmek İstediğiniz Tutarı Giriniz:");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (bakiye < tutar) {
                    System.out.println("Yetersiz Bakiye \n" + "Bakiyeniz:" + bakiye);
                } else {

                    bakiye -= tutar;
                    System.out.println("Yeni Bakiyeniz:" + bakiye);
                }

            } else if (islem.equals("3")) {
                System.out.print("Yatırmak İstediğiniz Tutar:");
                int tutar2 = scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar2;
                System.out.println("Yeni Bakiyeniz:" + bakiye);

            } else {
                System.out.println("Geçersiz İşlem!!!");
            }
        }
    }
}