/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0.0;
        for (Produk produk : daftarProduk) {
            double hargaSetelahDiskon = produk.getHarga() - produk.hitungDiskon();
            total += hargaSetelahDiskon;
        }
        return total;
    }

    public void tampilkanProduk() {
        for (Produk produk : daftarProduk) {
            System.out.println(produk.getNama() + ": " + produk.getHarga() + " (Diskon: " + produk.hitungDiskon() + ")");
        }
    }
}

