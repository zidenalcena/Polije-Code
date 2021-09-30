package acara4;

import java.util.Scanner;

/** * * @author HP */
public class tugas11 {
    /** * @param args the command line arguments */
    public static void main(String[] args) {
        Scanner ketupat = new Scanner(System.in);
        System.out.print("\n...:: Mencari Luas Belah Ketupat::...\n");
        System.out.print("masukan nilai diagonal1: ");
        double d1 = ketupat.nextDouble();
        System.out.print("masukan nilai diagonal2: ");
        double d2 = ketupat.nextDouble();

        double lu = (d1 * d2) * 1 / 2;
        double keliling = (d1 + d2 * 2);
        System.out.print("luas belah ketupat adalah: " + lu);
        System.out.println("");
        System.out.print("keliling belah ketupat adalah: " + keliling);
        System.out.println("");
    }
}