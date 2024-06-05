package week10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------Pilih Menu-------------");
        System.out.println("1. Segitiga");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi");
        System.out.println("5. Exit");
        System.out.println("------------------------------------");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                int sisi = scanner.nextInt();
                Persegi persegi = new Persegi(sisi);
                persegi.luas();
                persegi.keliling();
                break;

            case 2:
                System.out.print("Masukkan radius lingkaran: ");
                int radius = scanner.nextInt();
                Lingkaran lingkaran = new Lingkaran(radius);
                lingkaran.luas();
                lingkaran.keliling();
                break;

            case 3:
                System.out.print("Masukkan sisi : ");
                sisi = scanner.nextInt();
                System.out.print("Masukkan sisi : ");
                sisi = scanner.nextInt();
                System.out.print("Masukkan sisi : ");
                sisi = scanner.nextInt();
                Segitiga segitiga = new Segitiga(sisi, sisi, sisi);
                segitiga.keliling();

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
