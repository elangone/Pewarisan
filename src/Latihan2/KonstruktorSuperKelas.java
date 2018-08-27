/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Taka
 */
public class KonstruktorSuperKelas 
{
    public static void main(String[] args) {
        Employ programer1 = new Employ ("12345678", "Yatno", 32);
        programer1.info();
        
        System.out.println();
        
        Person elang = new Person ("Elang", 17);
        elang.info();
    }
}
