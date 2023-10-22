package TP_MOD_06_1301213389_MUHAMMADFATIHYUMNA;

public class DriverTP06 {
    public static void main(String[] args) {
        // Buat objek Koordinat A
        Koordinat A = new Koordinat(30, 24);

        // Buat objek Koordinat3D B
        Koordinat3D B = new Koordinat3D(20, 14, 15);

        // Output hasil perhitungan jarak antara B dengan A
        double jarakBA = B.hitungJarak(A);
        System.out.println("Jarak B ke A: " + jarakBA);

        // Buat objek Koordinat3D C
        Koordinat3D C = new Koordinat3D(22, 52, 64);

        // Output hasil perhitungan jarak antara B dengan C
        double jarakBC = B.hitungJarak(C);
        System.out.println("Jarak B ke C: " + jarakBC);

        // Buat objek KoordinatLingkaran D dan E
        KoordinatLingkaran D = new KoordinatLingkaran(70, 120, 25.5);
        KoordinatLingkaran E = new KoordinatLingkaran(50, 100, 65.2);

        // Output hasil perhitungan jarak antara D dengan E
        double jarakDE = D.hitungJarak(E);
        System.out.println("Jarak D ke E: " + jarakDE);

        // Check apakah D dan E bersinggungan
        boolean isBersinggungan = D.isBersinggungan(E);
        if (isBersinggungan) {
            System.out.println("D dan E bersinggungan");
        } else {
            System.out.println("D dan E tidak bersinggungan");
        }
    }
}