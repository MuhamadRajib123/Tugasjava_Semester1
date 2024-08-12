/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9no2;
import java.util.Scanner;

/**
 *
 * @author Rajib
 */
public class Bab9No2 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
        
    System.out.println("Masukan Nilai Bilangan Awal:");
    int nilaiawal = myInput.nextInt();
    
    System.out.println("Masukan Nilai Bilangan Akhir:");
    int nilaiakhir = myInput.nextInt();
    
    System.out.print("Hasil deret bilangan:\n" + nilaiawal );
        
        int currentNumber = nilaiawal ;
        
        // Menggunakan while loop untuk menampilkan deret bilangan dengan pertambahan 5
        while (currentNumber + 5 <= nilaiakhir) {
            currentNumber += 5;
            System.out.print(", " + currentNumber);
        }
    }
}
