/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.berkas;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class LatihanMandiriStreamdanFile {
    
    public static void main(String[] args) {
        
        File laporan = new File("laporan.txt");
        
        System.out.println("=== Cek laporan.txt ===");
        System.out.println("Apakah file ada? " + laporan.exists());
        
        if(laporan.exists()) {
            System.out.println("Ukuran file: " + laporan.length() + " byte");
        }
        
        File arsip = new File("arsip");
        
        System.out.println("\n=== Membuat folder arsip ===");
        boolean berhasil = arsip.mkdir();
        
        if (berhasil) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }
        
        File sementara = new File("sementara.txt");
        
        try {
            sementara.createNewFile();
            
            System.out.println("\n== File sementara.txt ===");
            System.out.println("Sebelum dihapus: " + sementara.exists());
            
            sementara.delete();
            
            System.out.println("Sesudah dihapus: " + sementara.exists());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
    
}
