package org.example;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

public class codelab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Memasukkan nama, jenis kelamin, dan tanggal lahir
        System.out.print("Nama: ");
        String nama = scan.nextLine();

        System.out.print("Jenis Kelamin (P/L): ");
        char jnsKlmin1 = scan.next().charAt(0);
        String jnsKlmin2 = (jnsKlmin1 == 'L' || jnsKlmin1 == 'l') ? "Laki-Laki" : "Perempuan";

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tgllhr1 = scan.next();
        LocalDate tgllhr2 = LocalDate.parse(tgllhr1, DateTimeFormatter.ISO_DATE);

        //Menggunakan LocalDate untuk menghitung umur dan disimpan di Period
        LocalDate tglSkrg = LocalDate.now();
        Period selisihUmur = Period.between(tgllhr2, tglSkrg);
        int umurThn = selisihUmur.getYears();
        int umurBln = selisihUmur.getMonths();

        //output
        System.out.println(" ");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jnsKlmin2);
        System.out.println("Umur Anda : " + umurThn + " Tahun " + umurBln + " Bulan");

        //Entek
        scan.close();
    }
}
