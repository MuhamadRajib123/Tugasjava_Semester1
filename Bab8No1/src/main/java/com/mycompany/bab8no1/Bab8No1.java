/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8no1;
import java.util.Scanner;
/**
 *
 * @author Rajib
 */
public class Bab8No1 {

    public static void main(String[] args) {
         Scanner myInput = new Scanner(System.in);
        
    System.out.println("Masukan Nilai Awal:");
    int nilaiawal = myInput.nextInt();
    
    System.out.println("Masukan Nilai Akhir:");
    int nilaiakhir = myInput.nextInt();
    
    System.out.println("Hasil:");
    
    int label = 1; 
        for (int i = nilaiawal; i <= nilaiakhir; i += 5) {
            System.out.println(label + ". " + i);
            label++;
        }
    }
}
