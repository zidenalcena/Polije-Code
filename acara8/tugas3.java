package acara8;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        String kartu;
        int total, diskon, bayar;

        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah pelanggan mempunyai kartu anggota (y atau t ) ?");
        kartu = sc.nextLine();
        System.out.print("Berapa total harga barang belanjaan? Rp ");
        total = sc.nextInt();
        if (kartu.equals("y")) {
            // System.out.println("tes");
            if (total > 500000) {
                diskon = 50000;
            } else {
                diskon = 25000;
            }
        } else {
            if (total > 200000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }
        bayar = total - diskon;
        System.out.println("total yang harus dibayar: Rp " + bayar);
    }
}
