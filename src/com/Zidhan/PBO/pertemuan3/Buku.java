package com.Zidhan.PBO.pertemuan3;

public class Buku {
    int no_buku;
    String judul_buku;
    String Pengarang;
    int tahun_terbit;
    int harga;

    public Buku() {}

    public Buku(int no_buku, String judul_buku, String pengarang, int tahun_terbit, int harga) {
        this.no_buku = no_buku;
        this.judul_buku = judul_buku;
        this.Pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
        this.harga = harga;
    }

    public int getNo_buku() {
        return no_buku;
    }

    public void setNo_buku(int no_buku) {
        this.no_buku = no_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void showInfo() {
            System.out.println("No Buku      : " + no_buku);
            System.out.println("Judul Buku   : " + judul_buku);
            System.out.println("Pengarang    : " + Pengarang);
            System.out.println("Tahun Terbit : " + tahun_terbit);
            System.out.println("Harga        : " + harga);
            System.out.println();
        }

    }

