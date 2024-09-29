/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ACER
 */
abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungDiskon();
}

class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama,harga);   
    }
    @Override
    public double hitungDiskon() {
        // Diskon 10% untuk Buku
        return harga * 0.10;
    
    }
}

class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama,harga);   
    }
    @Override
    public double hitungDiskon() {
        // Diskon 10% untuk Buku
        return harga * 0.15;
    
    }
}

class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama,harga);   
    }
    @Override
    public double hitungDiskon() {
        // Diskon 10% untuk Buku
        return harga * 0.20;
    
    }
}