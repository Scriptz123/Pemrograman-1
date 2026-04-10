package SourcePackage.Package.Latihan;

public class Latihan2 {
    public static void main(String[] args) {
        double makan = 20000;
        double transport = 10000;
        double belanja = 50000;

        double total = makan + transport + belanja;

        double makanPersen = (double) (makan / total) * 100;
        double transportPersen = (double) (transport / total) * 100;
        double belanjaPersen = (double) (belanja / total) * 100;

        System.out.println("Total Perhitungan Pengeluaran");
        System.out.println("Makan: " + makan);
        System.out.println("Transport: " + transport);
        System.out.println("Belanja: " + belanja);
        System.out.println("Total: " + total);

        System.out.println("Persentase Pengeluaran");
        System.out.println("Makan: " + makanPersen + "%");
        System.out.println("Transport: " + transportPersen + "%");
        System.out.println("Belanja: " + belanjaPersen + "%");
    }
}
