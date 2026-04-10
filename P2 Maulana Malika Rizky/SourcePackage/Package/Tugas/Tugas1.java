package SourcePackage.Package.Tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        int tahunLahir = 2026 - umur;

        System.out.println("Informasi");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Perkiraan Tahun Lahir: " + tahunLahir);
        
    }
    
}
