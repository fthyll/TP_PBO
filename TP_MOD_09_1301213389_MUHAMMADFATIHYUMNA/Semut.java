package TP_MOD_09_1301213389_MUHAMMADFATIHYUMNA;

public class Semut extends Serangga {
    public Semut(String warna, Koordinat k) {
        super(warna, k);
    }

    public void gerak(Koordinat k) {
        getPosisi().setX(getPosisi().getX() + k.getX());
        getPosisi().setY(getPosisi().getY() + k.getY());
    }

    public void info() {
        System.out.println("Warna : " + getWarna());
        System.out.println("Posisi : " + getPosisi());
    }
}