/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Taka
 */
public class A 
{
    private int a, c;
    public void setA(int nilai)
    {
        a = nilai;
    }
    
    
    public int getA()
    {
        return a;
    }
    
    public void setC(int nilai)
    {
        c = nilai;
    }
    
    public int getC()
    {
        return c;
    }
    
    public void tampilkanNilai()
    {
        System.out.println("Nilai a : "+getA());
    }
    public void tampilkanNilaic(){
        System.out.println("Nilai c : "+getC());
    }
}
