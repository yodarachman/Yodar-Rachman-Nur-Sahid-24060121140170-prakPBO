/*
 * File : Programmer.java  
 * Penulis : Yoda Rachman Nur Sahid(24060121140170)
 * Deskripsi : Representasi dari objek programmer
*/

package com.PolimorfismeInclusion;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
        this.bonus = bonus;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
