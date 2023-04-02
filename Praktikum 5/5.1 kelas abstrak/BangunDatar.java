/**
 * File : BangunDatar.java 02/04/2023
 * Penulis : Yoda Rachman Nur Sahid
 * Deskripsi : kelas yang berisi abstraksi bangun datar
 */

public abstract class BangunDatar{
    protected double luas;
    public abstract double hitungLuas(double sisi);
    protected void setLuas(double Luas){
        this.luas = Luas;
    }
    public double getLuas(){
        return luas;
    }
}