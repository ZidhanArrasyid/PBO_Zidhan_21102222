package com.Zidhan.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan Angka :");
            int angka1 = input.nextInt();

            System.out.println("Masukkan Pembagi :");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil + "(dibulatkan)");

        //Multiple Exception Lebih praktis karena dijadikan satu
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Error : " + e);
        }
        //Multiple Catch lebih detail menunjukkan dimana letak salahnya
//        catch (ArithmeticException e){
//            System.out.println("Error : Kesalahan dalam perhitungan");
//        }
//        catch (InputMismatchException e){
//            System.out.println("Error : Kesalahan dalam input");
//        }
        finally {
            System.out.println("Finally akan selalu dijalankan");
        }
        System.out.println("Akhir dari program");
    }
}