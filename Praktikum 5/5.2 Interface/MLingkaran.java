/**
 * File : MLingkaran.java 02/04/2023
 * Penulis : Yoda Rachman Nur Sahid
 * Deskripsi : Kelas yang berisi driver untuk kelas lingkaran
 */

public class MLingkaran {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan jejari " + l.jejari + " adalah " + l.hitungLuas());
    }
}