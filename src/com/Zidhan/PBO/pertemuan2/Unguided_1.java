package com.Zidhan.PBO.pertemuan2;

import java.util.Scanner;

public class Unguided_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menampilkan Bilangan Genap");
        System.out.print("Masukkan Batas Bilangan : ");
        int batas = input.nextInt();;

        for (int i = 1; i <= batas; i++) {
            if (i % 2 == 0) {
                System.out.println("Bilangan Genap : " +i);
            }
        }
    }
}
