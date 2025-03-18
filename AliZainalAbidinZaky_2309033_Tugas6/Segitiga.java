package AliZainalAbidinZaky_2309033_Tugas6;
import java.util.Scanner;

/**
 *
 * @author Ali Zaky
 */
public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan data untuk 3 segitiga
        for (int i = 1; i <= 3; i++) {
            System.out.println("Masukkan data untuk Segitiga " + i + ":");

            System.out.print("Alas: ");
            double alas = input.nextDouble();
            System.out.print("Tinggi: ");
            double tinggi = input.nextDouble();
            System.out.print("Sisi: ");
            double sisi = input.nextDouble();

            // Membuat objek dengan nilai input dari user
            Objek segitiga = new Objek(alas, tinggi, sisi);

            // Menampilkan informasi segitiga
            System.out.println("\nHasil Perhitungan Segitiga ke-" + i + " :");
            segitiga.printOut();
        }
    }
}
