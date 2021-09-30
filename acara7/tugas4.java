package acara7;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {

        // BUat scanner
        Scanner sl = new Scanner(System.in);

        // ambil nilai dari keyboard
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = sl.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = sl.nextInt();

        // hitung dan print
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);

    }

}