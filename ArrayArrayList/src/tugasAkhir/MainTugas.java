
// Nama : Chintya Mahfuzah
// NPM  : 2410010320
package tugasAkhir;


public class MainTugas {
    public static void main(String[] args) {
        System.out.println("=== TUGAS AKHIR: PENGELOLAAN NILAI MAHASISWA ===");
        System.out.println();

        System.out.println("--- Daftar Mata Kuliah (Array String) ---");
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Sistem Berkas", "Kalkulus"};
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        System.out.println("--- Mengisi Data Awal Minimal 5 Mahasiswa ---");
        kelas.tambahMahasiswa(new Mahasiswa("Chintya", "23100101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Mahfuzah", "23100102", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Moh.Ikhsan", "23100103", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Rudya", "23100104", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Wati", "23100105", 75.0));
        
        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("--- Analisis Nilai Kelas ---");
        System.out.println("Rata-rata Nilai Kelas   : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
        System.out.println();

        System.out.println("--- Penambahan Mahasiswa Baru (Menguji Dinamisasi) ---");
        kelas.tambahMahasiswa(new Mahasiswa("Fadli", "23100106", 65.0));
        
        kelas.tampilkanSemua();
        System.out.println();
        
        System.out.println("--- Analisis Nilai Terbaru ---");
        System.out.println("Rata-rata Nilai Terbaru : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
    }
    
}
