package com.Zidhan.PBO.Pertemuan4;

public class Manajer extends Pegawai{

    public void bonus(int bonus) {
        System.out.println("Pegawai dengan nama : " + nama + " Dengan NIP : " +
                nip + " Mendapatkan Bonus : " + bonus);
    }

    public void bonus(){
            System.out.println("Harap masukkan jumlah bonus");
        }

}



