package SourcePackage.Package.Latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        float kehadiran; float realisasi; float tugas; float uts; float uas;
       
        System.out.println("Input realisasi:");
        realisasi = input.nextFloat();
        System.out.println("Realisasi:" + realisasi);
       
        System.out.println("Input kehadiran");
        kehadiran = input.nextFloat();
        System.out.println("Kehadiran:" + kehadiran);
        
        System.out.println("Input tugas");
        tugas = input.nextFloat();
        System.out.println("Tugas:" + tugas);

        System.out.println("Input uts");
        uts = input.nextFloat();
        System.out.println("UTS:" + uts);

        System.out.println("Input uas");
        uas = input.nextFloat();
        System.out.println("UAS:" + uas);

        float b_kehadiran =( kehadiran / realisasi) * 10;
        float b_tugas = tugas * 20 / 100;
        float b_uts = uts * 30 / 100;
        float b_uas = uas * 40 / 100;

        float total = b_kehadiran + b_tugas + b_uts + b_uas;

        System.out.println("Kehadiran" + kehadiran + "Dari Realisasi" + realisasi);
        System.out.println("NilaiTugas:" + b_tugas);
        System.out.println("UTS:" + b_uts);
        System.out.println("UAS:" + b_uas);
        System.out.println("Totalnya" + total);
    }
}
