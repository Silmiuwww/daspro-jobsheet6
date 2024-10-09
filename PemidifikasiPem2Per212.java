import java.util.Scanner;

public class PemidifikasiPem2Per212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int menu;
        String member, pembayaran;
        double total_bayar, harga = 0, diskon = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukan angka dari menu yang dipilih = ");
        menu = sc.nextInt();
        sc.nextLine();  
        System.out.print("Apakah punya member (y/t) ? = ");
        member = sc.nextLine();
        System.out.println("-------------------------------------");

        if (menu < 1 || menu > 3) {
            System.out.println("Masukan pilihan menu yang benar");
            return;
        }

        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
        } else if (!member.equals("t")) {
            System.out.println("Input untuk member tidak valid");
            return;
        }

        switch (menu) {
            case 1:
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                break;
            case 2:
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
                break;
            case 3:
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);
                break;
        }

        if (member.equals("y")) {
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else {
            total_bayar = harga;
            System.out.println("Total bayar = " + total_bayar);
        }

        System.out.println("-------------------------------------");
    }
}


