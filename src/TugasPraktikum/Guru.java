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
public class Guru {
    private String id;
    private String nama;
    
    public Guru (String id, String nama){
        this.id=id;
        this.nama=nama;
    }
    
    public void ket(){
        System.out.println("====================================");
        System.out.println("ID                 : "+this.id);
        System.out.println("NAMA               : "+this.nama);
    }
}
