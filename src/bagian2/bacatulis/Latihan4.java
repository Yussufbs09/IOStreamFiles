/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.bacatulis;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author USER
 */
public class Latihan4 {
    public static void main(String[] args) {
        try (BufferedReader pembaca = new BufferedReader(new FileReader("mahasiswa.txt"))){
            String baris;
            int nomor = 1;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(nomor + ". " + baris);
                nomor++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
    
}
