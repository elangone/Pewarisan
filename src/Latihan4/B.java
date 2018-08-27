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
public class B extends A
{
    private int b;
    private int d;
    public void setB (int nilai)
    {
        b = nilai;
    }
    
    public void setD (int nilai){
        d = nilai;
    }
    
    public int getB()
    {
        return b;
    }
    
    public int getD()
    {
        return d;
    }
    
    //melakukan override terhadap method tampilkanNilai ()
    //yang terdapat pada kelas A
    
    public void tampilkanNilai()
    {
        super.tampilkanNilai(); //memanggil method dalam kelas A
        System.out.println("Nilai b : "+getB());
    }
    public void tampilkanNilaid(){
        System.out.println("Nilai d : "+getD());
    }
    
}
