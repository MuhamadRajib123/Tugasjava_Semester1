  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5no1;
import java.util.Scanner;
/**
 *
 * @author Rajib
 */
public class Bab5No1 {

    public static void main(String[] args) {
      
    Scanner myInput = new Scanner(System.in);
    
    System.out.println("Masukan Nama Anda:");
    String name = myInput.nextLine();
    
    System.out.println("Masukan Alamat Anda:");
    String alamat = myInput.nextLine();
    
    System.out.println("Masukan Usia Anda:");
    int age = myInput.nextInt();
    
    System.out.println("Masukan Gaji Anda:");
    double gaji = myInput.nextDouble();
 
    System.out.println(" ### Pendataan Karyawan PT. Ilmu Padi ### ");
    System.out.println("Nama Karyawan : " + name);
    System.out.println("Alamat : " + alamat);  
    System.out.println("Usia: " + age);
    System.out.println("Gaji: " + gaji);
   
    }
}