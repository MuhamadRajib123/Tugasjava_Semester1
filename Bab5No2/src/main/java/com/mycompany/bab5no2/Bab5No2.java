/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5no2;
import java.util.Scanner;
/**
 *
 * @author Rajib
 */
public class Bab5No2 {

    public static void main(String[] args) {  
    
    Scanner myInput = new Scanner(System.in);
    
    System.out.println("Masukan Alas:");
    Double alas = myInput.nextDouble();
    
    System.out.println("Masukan Tinggi:");
    Double tinggi = myInput.nextDouble();
    
    Double luas = (alas*tinggi)/2;
    
    System.out.println("luas segtiga :" + luas);
   

   
    }
}
