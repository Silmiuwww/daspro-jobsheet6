import java.util.Scanner;

public class Pertemuan6Latihan312 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        String[] merk = {"Converse", "Converse", "Sketcher", "Sketcher", "Nike", "Nike"};
        String[] kategori = {"Slip On", "High Top", "Woman", "Man", "Kids", "Adult"};
        String[] ukuran = {"36-40", "40-44", "36-41", "41-44", "36-40", "40-44"};
        int[] harga = {800000, 1200000, 1000000, 1800000, 750000, 1500000};

        System.out.print("Masukkan angka untuk merek (0: Converse Slip On, 1: Converse High Top, 2: Sketcher Woman, 3: Sketcher Man, 4: Nike Kids, 5: Nike Adult): ");
        int pilihan = input12.nextInt();

        System.out.println("Merek: " + merk[pilihan]);
        System.out.println("Kategori: " + kategori[pilihan]);
        System.out.println("Ukuran: " + ukuran[pilihan]);
        System.out.println("Harga sepatu: Rp" + harga[pilihan]);

    }
}


