/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10no2;

/**
 *
 * @author Rajib
 */
public class Bab10No2 {

    public static void main(String[] args) {
      int a=5, b=3;
        
        aritmatika aritmatika1 = new aritmatika();
        
        aritmatika1.setTambah(a, b);
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Pertambahan " + aritmatika1.getAngka());
        
        System.out.println();
        
        aritmatika aritmatika2 = new aritmatika();
        
        aritmatika2.setPerkalian(a, b);
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Perkalian " + aritmatika2.getAngka());
        
        System.out.println();
        
        aritmatika aritmatika3 = new aritmatika();
        
        aritmatika3.setPembagian(a, b);
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Pembagian " + aritmatika3.getAngka());
        
        System.out.println();
        
        aritmatika aritmatika4 = new aritmatika();
        
        aritmatika4.setPerkalian(a, b);
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Perpangkatan " + aritmatika4.getAngka());
    }
}
