import java.util.Scanner;

public class Pemilihan2Percobaan212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int menu ;
        String member, pembayaran ;
        double total_bayar, harga = 0, diskon = 0 ;
        

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("1. Ice tea");
        System.out.println("1. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukan angka dari menu yang dipilih = ");
        menu = sc.nextInt();
        sc.nextLine();
        System.out.println("Apakah punya member (y/t) ? = ");
        member = sc.nextLine();
        System.out.println("-------------------------------------");
        
        if (member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukan pilihan menu yang benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }

        else if (member.equalsIgnoreCase("t")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (
                menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukan pilihan menu yang benar");
                return;
            }

            System.out.println("Total bayar = " + harga);
        }else {
            System.out.println("Member tidak valid");
        } 
        System.out.println("-------------------------------------");
      } 
    }
