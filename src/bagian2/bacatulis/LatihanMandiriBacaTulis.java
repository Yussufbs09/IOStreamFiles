/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author USER
 */
public class LatihanMandiriBacaTulis {
    
    public static void main(String[] args) {
        
        String fileName = "hari.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            
            writer.write("Senin");
            writer.newLine();
            writer.write("Selasa");
            writer.newLine();
            writer.write("Rabu");
            writer.newLine();
            writer.write("Kamis");
            writer.newLine();
            writer.write("Jumat");
   
            System.out.println("=== Tulis 5 hari pertama ===");
            System.out.println("Berhasil menulis ke hari.txt");
        } catch (IOException e){
            System.out.println("Error menulis file: " + e.getMessage());
        }
        
        System.out.println("\n=== Isi file hari.txt ===");
        bacaFile(fileName);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            
            writer.newLine();
            writer.write("Sabtu");
            writer.newLine();
            writer.write("Minggu");
            
            System.out.println("\n=== Append 2 hari ===");
            System.out.println("Berhasil menambahkan data");
    } catch (IOException e) {
        System.out.println("Error append file: " + e.getMessage());
    }
        
        // Tampilkan seluruh isi setelah append
        System.out.println("\n=== Isi file setelah append ===");
        bacaFile(fileName);

        // 3. Hitung jumlah baris
        int jumlahBaris = hitungBaris(fileName);
        System.out.println("\n=== Jumlah baris ===");
        System.out.println("Total baris: " + jumlahBaris);
    }

    // Method untuk membaca file
    public static void bacaFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String baris;
            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Error membaca file: " + e.getMessage());
        }
    }

    // Method untuk menghitung jumlah baris
    public static int hitungBaris(String fileName) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            while (reader.readLine() != null) {
                count++;
            }

        } catch (IOException e) {
            System.out.println("Error menghitung baris: " + e.getMessage());
        }

        return count;
    } 
    
}
