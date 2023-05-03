package com.Zidhan.PBO.Pertemuan5;

public class main {
    public static void main(String[] args) {
        Barang[] keranjang = new Barang[10];

        Barang[] etalase = {
                new Barang("Indomie",2000),
                new Barang("Mie Sedap",2000),
                new Barang("Beras",12000),
                new Barang("Gula",15000),
        };

        System.out.println(
                "Banyak Barang di Etalase : "
                + etalase.length
        );

        System.out.println("Daftar Barang di Etalase : ");

        int i = 1;
        for (Barang barang : etalase){
            System.out.println("Barang ke-" + i);
            barang.showinfo();
            i++;
        }

        for (int j=0; j<etalase; j++){
            System.out.println("Barang ke-" + (j+1));
            etalase[j].showinfo();
        }

        //Memasukkan Barang ke Keranjang
        keranjang[0] = etalase[0];
        System.out.println("Barang di keranjang : ");
        keranjang[0].showinfo();
    }
}
