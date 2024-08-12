/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6no2;

import java.util.Scanner;

/**
 *
 * @author Rajib
 */
public class Bab6No2 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
    
          
    System.out.println("Masukan Nama Anda:");
    String name = myInput.nextLine(); 
    
    System.out.println("Masukan NIM Anda:");
    String nim = myInput.nextLine();
    
    System.out.println("Masukan Nilai Anda:");
    int nilai = myInput.nextInt();
    
     if (nilai < 50){
            System.out.println("Tidak Lulus");
        } else if (nilai >= 50 && nilai < 60) {
            System.out.println("Grade D");
            System.out.println("Keterangan : Lulus");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Grade C");
            System.out.println("Keterangan : Lulus");
        } else if (nilai >=70 && nilai < 80) {
            System.out.println("Grade B");
            System.out.println("Keterangan : Lulus");
        } else if (nilai >=80 && nilai < 90) {
            System.out.println("Grade A");
            System.out.println("Keterangan : Lulus");
        } else if (nilai >=90 && nilai < 100) {
            System.out.println("Grade A+");
            System.out.println("Keterangan : Lulus");
        }else {
            System.out.println("DATA NILAI SALAH!!");
        }
    }
}
