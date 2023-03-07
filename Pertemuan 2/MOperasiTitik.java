/*
 * File      : MOperasiTitik.java	(07/03/23)	
 * Penulis   : Yoda Rachman Nur Sahid
 * Deskripsi : Kelas yang berisi main dari MOperasiTitik
 */

class MOperasiTitik{
	public static void main(String[] args){
		Titik t1 = new Titik(1.0, 2.0);
		OperasiTitik op = new OperasiTitik();
		
		System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		
		op.refleksiX(t1);
		System.out.println("\n Refleksi Terhadap Sumbu X");
		System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		
		op.refleksiY(t1);
		System.out.println("\n Refleksi Terhadap Sumbu Y");
		System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
	}
}