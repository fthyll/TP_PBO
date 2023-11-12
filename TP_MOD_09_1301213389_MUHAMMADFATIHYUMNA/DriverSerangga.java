package TP_MOD_09_1301213389_MUHAMMADFATIHYUMNA;

public class DriverSerangga {
    public static void main(String[] args) {
        Serangga semut = new Semut("Merah", new Koordinat(70, 90));
        semut.info();
        semut.gerak(new Koordinat(80, 100));
        semut.info();

        Serangga lebah = new Lebah("Orange", new Koordinat3D(30, 40, 50));
        lebah.info();
        lebah.gerak(new Koordinat3D(45, 55, 65));
        lebah.info();
    }
}