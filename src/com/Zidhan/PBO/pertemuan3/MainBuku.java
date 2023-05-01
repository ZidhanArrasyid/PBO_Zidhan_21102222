package com.Zidhan.PBO.pertemuan3;

import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Buku bk1 = new Buku(1, "Pemrograman Berbasis Objek dengan Java",
                "Indrajani", 2007, 70000);
        Buku bk2 = new Buku(2, "Dasar Pemrograman Java",
                "Abdul Khadir", 2004, 30000);

        System.out.println("==== List Buku ====");
        bk1.showInfo();
        bk2.showInfo();

        System.out.println("==== List Buku ====");
        System.out.print("Masukkan No Buku yang ingin dibeli     : ");
        int pilih = scanner.nextInt();
        System.out.print("Masukkan Jumlah Buku yang ingin dibeli : ");
        int jumlah = scanner.nextInt();

        if (pilih == 1) {
            int totalHarga = bk1.getHarga() * jumlah;
            System.out.println("Total Harga = " + totalHarga);
            System.out.print("Masukkan Jumlah Uang : ");
            int bayar = scanner.nextInt();

            System.out.println();
            if (bayar <= totalHarga) {
                System.out.println("Mohon maaf uang anda tidak cukup");
            } else {
                System.out.println("==== Rincian Pembelian Buku ====");
                System.out.println("Jumlah Bayar : " + bayar);
                System.out.println("Kembalian    : " + (bayar - totalHarga));
            }
        }else if (pilih == 2) {
            int totalHarga = bk2.getHarga() * jumlah;
            System.out.println("Total Harga = " + totalHarga);
            System.out.print("Masukkan Jumlah Uang : ");
            int bayar = scanner.nextInt();

            System.out.println();
            if (bayar <= totalHarga) {
                System.out.println("Mohon maaf uang anda tidak cukup");
            } else {
                System.out.println("==== Rincian Pembelian Buku ====");
                System.out.println("Jumlah Bayar : " + bayar);
                System.out.println("Kembalian    : " + (bayar - totalHarga));
            }
        }else {
            System.out.println("Pilihan tidak Tersedia");
        }
    }

}
