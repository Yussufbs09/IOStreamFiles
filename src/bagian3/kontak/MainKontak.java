/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

/**
 *
 * @author USER
 */
public class MainKontak {
    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak("Kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "081111"));
        buku.tambahKontak(new Kontak("Budi", "082222"));
        buku.tambahKontak(new Kontak("Citra", "08333"));
        
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        
        System.out.println();
        
        BukuKontak bukuLain = new BukuKontak("Kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak : " + bukuLain.jumlahKontak());
    }
}
