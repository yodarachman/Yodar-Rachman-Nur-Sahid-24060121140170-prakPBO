/**
 * File : SerializePerson.java
 * Penulis : Yoda Rachman Nur Sahid
 * Deskripsi : program untuk serialisasi objek person
*/

import java.io.*;
class Person implements Serializable {
    private String name;
    public Person(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}