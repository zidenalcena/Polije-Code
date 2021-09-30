package acara8;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil;

        System.out.println("Masukkan sebuah bilangan:");
        bil = input.nextInt();

        if (bil % 2 == 0) {
            System.out.println("bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }

}
