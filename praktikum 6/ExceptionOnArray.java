/*
 * File : ExceptionOnArray.java 02/04/2023
 * Penulis : Yoda Rachman Nur Sahid
* Deskripsi : Program penggunaan eksepsi menggunakan class library Java
*/

public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}