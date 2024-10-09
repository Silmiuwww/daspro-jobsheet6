import java.util.Scanner;
public class Pertemuan6Latihan112 {
    public static void main(String[] args) {
        Scanner input12 =new Scanner(System.in);
    
        int bil1 = 28, bil2 = 54, bil3 = 15;

        int terbesar = bil2;

        if (bil1 > terbesar) {
            terbesar = bil2;
        }

        if (bil3 > terbesar) {
            terbesar = bil3;
        }

        System.out.println("Bilangan terbesar: " + terbesar);
    }
}
