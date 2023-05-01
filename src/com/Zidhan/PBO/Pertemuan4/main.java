package com.Zidhan.PBO.Pertemuan4;

public class main {

    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        manajer.nip = 123;
        manajer.nama = "Zidhan";

        manajer.showInfo();

        //polimorfisme

        manajer.bonus(10000);
        manajer.bonus();
    }
}
