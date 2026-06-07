package bagian1.array;


public class LatihaMandiri2 {
    
    public static void main(String [] args){
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("=== NAMA HARI LEBIH DARI 5 HURUF ===");
        
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println("- " + hari);
            }
        }
    }
    
}
