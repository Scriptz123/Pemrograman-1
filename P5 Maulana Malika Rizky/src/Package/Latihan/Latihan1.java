/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Package.Latihan;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input kehadiran: ");
        int absen = input.nextInt();
        
        System.out.println("Input total: ");
        int total = input.nextInt();
        
        input.close();
        
        float validasi = 21 *  (75 / 100);
        
        String grade;
        if(total >= 80) {
            grade = "A";
        }
        else if(total >= 70) {
            grade = "B";
        }
        else if(total >= 60) {
            grade = "C";
        }
        else if(total >= 55) {
            grade = "D";
        }
        else {
            grade = "E";
        }
        
        if (absen >= validasi && total >= 55){
            System.out.println("Total" + total + "& Grade:" + grade);
            System.out.println("Status: Lulus");
        } else {
            if(total >= 55){
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.println("Kamu dapat Grade: " + grade);
            System.out.println("Kamu tidak lulus: ");
        }
    }    
}
