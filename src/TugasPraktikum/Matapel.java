/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Taka
 */
public class Matapel extends Guru{
    public String mapel;
    
    public Matapel(String id, String nama, String mapel){
        super(id, nama);
        this.mapel = mapel;
    }
    
    //override
    public void ket(){
        super.ket();
        System.out.println("Mengajar Pelajaran : "+this.mapel);
    }
}
