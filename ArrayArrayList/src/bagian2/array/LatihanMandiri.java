package bagian2.array;

import java.util.ArrayList;

public class LatihanMandiri {
    public static void main(String[] args) {
        System.out.println("=== NO 1: DAFTAR BELANJA HARIAN ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("Beras");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Sabun");
        daftarBelanja.add("Gula");
        daftarBelanja.remove(1);
        System.out.println("Isi Daftar Belanja : " + daftarBelanja);
        System.out.println("Jumlah Item Belanja: " + daftarBelanja.size());
        System.out.println();

        System.out.println("=== NO 2: MENCARI NILAI TERBESAR ===");
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70); 
        nilai.add(95); 
        nilai.add(60); 
        nilai.add(88); 
        nilai.add(75);
        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        System.out.println("Nilai Terbesar: " + max);
        System.out.println();

        System.out.println("=== NO 3: FILTER NAMA BERAWALAN HURUF A ===");
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        for (String d : data) nama.add(d);
        for (String n : nama) {
            if (n.startsWith("A")) System.out.println("Nama: " + n);
        }
    }
}