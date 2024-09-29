/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args){
        //overloading
        //Hewan kucing = new Hewan();
        //kucing.bersuara();
        //kucing.makan("whiskas");
        //kucing.makan("whiskas",10);
        
        //Kucing kucing = new Kucing();
        //kucing.bersuara();
        
        //Anjing anjing = new Anjing();
        //anjing.bersuara();
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Pemrograman Java", 100000);
        Produk elektronik = new Elektronik("Smartphone", 2000000);
        Produk pakaian = new Pakaian("Kemeja", 150000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanProduk();

        double totalHargaSetelahDiskon = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total Harga Setelah Diskon: " + totalHargaSetelahDiskon);
    }    
}
