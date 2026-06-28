/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author USER
 */
public class Barang {
    // Atribut barang
    private String nama;
    private double harga;
    private int stok;

    // Constructor untuk menginisialisasi atribut
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk mengakses atribut dari luar class
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah data barang menjadi format string satu baris untuk disimpan ke berkas
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Mengembalikan informasi lengkap mengenai barang dalam bentuk teks
    public String info() {
        return nama + " - Rp" + harga + " (Stok: " + stok + ")";
    }
}
