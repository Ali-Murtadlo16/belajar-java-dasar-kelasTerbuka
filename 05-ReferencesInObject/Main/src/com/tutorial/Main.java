package com.tutorial;
class Buku {
    String judul;
    String penulis;
    String penerbit;
    int tahunTerbit;

    Buku(String judul, String penulis, String penerbit, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    void display(){
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
public class Main {
    public static void main(String[] args) {
        Buku dataBuku1 = new Buku("Pemrograman Java", "Ali Murtadlo", "Penerbit ABC", 2021);
        dataBuku1.display();

        // Show address of dataBuku1
        String addressBuku1 =Integer.toHexString(System.identityHashCode(dataBuku1));
        System.out.println(addressBuku1);

        // Assignment object
        Buku dataBuku2 = dataBuku1;
        dataBuku2.display();
        String addressBuku2 =Integer.toHexString(System.identityHashCode(dataBuku2));
        System.out.println(addressBuku2);

        // Different address
        dataBuku1.judul = "Pemrograman Java Lanjutan";
        dataBuku1.display();
        dataBuku2.display();

        //Insert object methods
        fungsi(dataBuku1);

    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku =Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("addressDalamBuku " + addressDataBuku);
    }

}
