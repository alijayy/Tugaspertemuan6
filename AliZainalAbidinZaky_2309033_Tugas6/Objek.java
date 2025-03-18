package AliZainalAbidinZaky_2309033_Tugas6;

public class Objek {
    double alas;
    double tinggi;
    double sisi;

    // Konstruktor dengan parameter
    public Objek(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    // Method untuk menghitung luas segitiga
    double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    double getKeliling() {
        return alas + (2 * sisi);
    }

    // Menampilkan informasi segitiga
    public void printOut() {
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi: " + sisi);
        System.out.println("\nLuas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println();
    }
}
