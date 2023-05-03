package com.Zidhan.PBO.Pertemuan5;

public class Barang {
    //Atribut
    String nama;

    int harga;

    //Constructor
    public Barang(){}

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void showinfo(){
        System.out.println("Nama Barang  : " + this.nama);
        System.out.println("Harga Barang : " + this.harga);
        System.out.println();
    }
}
