/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

/**
 *
 * @author USER
 */
public class Kontak {
    // Atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    // Constructor: dipanggil saat objek dibuat
    public Kontak(String nama, String nomor) {
        this.nama = nama;
        this.nomor = nomor;
}
    // Getter: cara membaca atribut dari luar class
    public String getNama() {
        return nama;
}
public String getNomor() {
return nomor;
}
// Mengubah objek menjadi satu baris teks untuk disimpan ke berkas
public String keBaris() {
return nama + ";" + nomor;
}
// Mengembalikan keterangan kontak dalam bentuk teks
public String info() {
return nama + " - " + nomor;
}
}
