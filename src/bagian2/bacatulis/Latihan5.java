/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class Latihan5 {
    public static void main(String[] args) {
        
        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt", true)))
        {            
            penulis.println("Dewi");
            penulis.println("Eka");
            System.out.println("Dua nama baru ditambahkan tanpa menghapus data lama.");
    } catch (IOException e) {
        System.out.println("Gagal menambah data: " + e.getMessage());
    }
    }
}
