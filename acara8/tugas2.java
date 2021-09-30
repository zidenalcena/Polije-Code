package acara8;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;

        System.out.println("Masukkan sebuah bilangan: ");
        nilai = input.nextInt();
        if (nilai >= 100) {
            nilai += 10;
        } else {
            nilai -= 10;
        }
        System.out.println("Hasil nilai akhir adalah :" + nilai);
    }
}
