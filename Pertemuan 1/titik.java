/**
//Nama file: titik.java			22/02/2023
//Pembuat: Yoda Rachman Nur Sahid
//Deskripsi: kelas yang berisi atribut dan method untuk menguji kelas titik
*/


class titik {
    double absis;
    double ordinat;
    static int countertitik;
    titik(double x, double y){
        absis = x;
        ordinat = y;
        countertitik++;
    }
    titik(){
        absis = 0;
        ordinat = 0;
        countertitik++;
    }
    void setAbsis(double x){
        absis = x;
    }
    void setOrdinat(double y){
        ordinat = y;
    }
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    int getCounterTitik(){
        return countertitik;
    }
    void cetakTitik(){
        System.out.println("Titik ("+absis+","+ordinat+")");
    }
}
