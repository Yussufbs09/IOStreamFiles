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
public class Latihan2 {
    public static void main(String[] args) {
        File berkas = new File("data.txt");
        try {
            if (berkas.createNewFile()) {
                System.out.println("Berkas baru dibuat.");
            } else {
                System.out.println("Berkas sudah ada sebelumnya.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
