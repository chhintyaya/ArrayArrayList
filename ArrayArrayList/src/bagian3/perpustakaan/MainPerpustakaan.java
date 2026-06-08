
package bagian3.perpustakaan;


public class MainPerpustakaan {
   
    public static void main(String[] args) {
        System.out.println("=== LATIHAN MANDIRI MULTI-CLASS PERPUSTAKAAN ===");
        Perpustakaan perpus = new Perpustakaan();

        System.out.println("--- Menambah Buku ke Koleksi ---");
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tampilkanKoleksi();
        System.out.println();

        System.out.println("--- Simulasi Peminjaman Buku ---");
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();

        System.out.println("--- Simulasi Pengembalian Buku (Latihan Mandiri 1) ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        System.out.println("--- Pencarian Buku Berdasarkan Penulis (Latihan Mandiri 3) ---");
        perpus.cariPenulis("Andrea Hirata");
        System.out.println();

        System.out.println("--- Status Koleksi Terbaru & Jumlah Tersedia ---");
        perpus.tampilkanKoleksi();
        System.out.println("Total buku yang tersedia untuk dipinjam: " + perpus.jumlahTersedia());
    }
    
}