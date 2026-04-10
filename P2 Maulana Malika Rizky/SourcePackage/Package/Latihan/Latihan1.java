package SourcePackage.Package.Latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        String nama; int usia;
        System.out.println("input nama:");
        nama=input.nextLine();
        System.out.println("Nama: " + nama);

        System.out.println("input usia:");
        usia=input.nextInt();
        System.out.println("Usia: " + usia);
    }

}
