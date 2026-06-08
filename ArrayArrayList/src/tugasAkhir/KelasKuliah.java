
package tugasAkhir;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa di Kelas ==");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mhs = daftarMahasiswa.get(i);
            String status = mhs.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + ". NPM: " + mhs.getNpm() + " | Nama: " + mhs.getNama() + " | Nilai: " + mhs.getNilai() + " [" + status + "]");
        }
    }
    
}
