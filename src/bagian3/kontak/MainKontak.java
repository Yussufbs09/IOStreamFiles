package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // 1. Inisialisasi buku kontak
        BukuKontak buku = new BukuKontak("data_kontak.txt");

        // 2. Tambah data contoh (menggunakan format 3 parameter: nama, nomor, email)
        buku.tambahKontak(new Kontak("Budi", "081234567890", "budi@email.com"));
        buku.tambahKontak(new Kontak("Siti", "085678901234", "siti@email.com"));
        buku.tambahKontak(new Kontak("Andi", "089876543210", "andi@email.com"));

        // 3. Simpan data awal ke berkas
        System.out.println("--- Menyimpan Data Awal ---");
        buku.simpanKeBerkas();
        buku.tampilkanSemua();
        System.out.println();

        // 4. Uji hapus kontak yang ADA (Siti)
        System.out.println("--- Menguji Hapus Kontak 'Siti' ---");
        buku.hapusKontak("Siti");
        
        // Tampilkan semua untuk memastikan Siti sudah hilang dari memori
        buku.tampilkanSemua();
        System.out.println();

        // 5. Uji hapus kontak yang TIDAK ADA (Joko)
        System.out.println("--- Menguji Hapus Kontak 'Joko' ---");
        buku.hapusKontak("Joko");
        System.out.println();

        // 6. Pembuktian: Muat ulang data dari berkas untuk memastikan berkas fisik benar-benar terupdate
        System.out.println("--- Memuat Ulang dari Berkas untuk Pembuktian ---");
        BukuKontak bukuBaru = new BukuKontak("data_kontak.txt");
        bukuBaru.muatDariBerkas();
        bukuBaru.tampilkanSemua(); 
        // Hasil akhir hanya akan menampilkan Budi dan Andi karena Siti sudah permanen terhapus dari berkas teks
    }
}