/*
 * File : PegawaiDanGaji.java  
 * Penulis : Yoda Rachman Nur Sahid(24060121140170)
 * Deskripsi : Representasi dari objek programmer
*/

package com.PolimorfismeInclusion;

public class PegawaiDanGaji {
    public static void main(String[] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
