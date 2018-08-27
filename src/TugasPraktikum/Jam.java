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
public class Jam extends Matapel{
    private String jampel;
    
    public Jam(String id, String nama, String mapel, String jampel){
        super(id, nama, mapel);
        this.jampel = jampel;
    }
    
    //override
    public void ket() {
        super.ket();
        System.out.println("Jam ke             : "+this.jampel);
        System.out.println("====================================");
    }
}
