import java.util.Scanner; 

public class Pemilihan2Percobaan112 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = sc.nextInt(); 

        
        if (tahun % 4 == 0) {
            if (tahun % 100 != 0 || tahun % 400 == 0) {
                System.out.println(tahun + " adalah Tahun Kabisat.");
            } else {
                System.out.println(tahun + " bukan Tahun Kabisat.");
            }
        } else {
            System.out.println(tahun + " bukan Tahun Kabisat.");
        }

    }
}
