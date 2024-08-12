/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8no2;

import java.util.Scanner;

/**
 *
 * @author Rajib
 */
public class Bab8No2 {

    public static void main(String[] args) {
    
       Scanner myInput = new Scanner(System.in);
        
    System.out.println("Masukan Nilai Akhir:");
    int nilaiakhir = myInput.nextInt();
    
    System.out.println("Masukan Nilai Awal:");
    int nilaiawal = myInput.nextInt();
    
    
    System.out.println("Hasil:");
    
     for (int i = nilaiakhir; i >= nilaiawal; i--) {
            System.out.println((i));
        }
    }
}
