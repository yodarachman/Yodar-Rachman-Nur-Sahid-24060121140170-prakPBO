/**
 * File      : Poligon.java		        15/03/23
 * Penulis   : Yoda Rachman Nur Sahid
 * Deskripsi : Representasi dasar dari objek poligon (segi banyak)
 */

package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public Poligon(){
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int jumlahSisi){
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}