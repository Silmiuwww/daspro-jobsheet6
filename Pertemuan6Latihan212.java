import java.util.Scanner;

public class Pertemuan6Latihan212 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (Kamus/Novel/Lainnya): ");
        String jenisBuku = input12.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input12.nextInt();

        System.out.print("Masukkan harga satu buku: ");
        double hargaBuku = input12.nextDouble();

        double totalHarga = hargaBuku * jumlahBuku;
        double diskon = 0;

        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            if (jumlahBuku > 2) {
                diskon = 12;  
            } else {
                diskon = 10; 
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            if (jumlahBuku > 3) {
                diskon = 9;   
            } else {
                diskon = 8;   
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5;   
            } else {
                diskon = 0;   
            }
        }

        double totalDiskon = totalHarga * diskon / 100;
        double hargaAkhir = totalHarga - totalDiskon;

        System.out.printf("Total yang harus dibayar setelah diskon: Rp%.2f\n", hargaAkhir);

    }
}
