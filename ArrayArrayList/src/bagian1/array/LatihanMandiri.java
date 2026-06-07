
package bagian1.array;

public class LatihanMandiri {
    public static void main(String [] args){
        double[] suhu = {27.0, 28.0, 29.0, 31.0, 32.0, 33.00,};
        
        double max = suhu [0];
        double min = suhu [0];
        
        for (double s : suhu){
            if (s > max){
                max = s;
            }
            if (s < min){
                min = s;
            }
        }
        System.out.println("=== HASIL SUHU HARIAN ===");
        System.out.println("Tertinggi : " + max);
        System.out.println("Terendah : " + min);
    }
    
}
