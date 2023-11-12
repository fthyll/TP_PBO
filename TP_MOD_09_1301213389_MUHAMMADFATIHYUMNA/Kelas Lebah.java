package TP_MOD_09_1301213389_MUHAMMADFATIHYUMNA;

public class Lebah extends Serangga {
    public Lebah(String warna, Koordinat3D k) {
        super(warna, k);
    }

    public void gerak(Koordinat k) {
        getPosisi().setX(getPosisi().getX() + k.getX());
        getPosisi().setY(getPosisi().getY() + k.getY());
        ((Koordinat3D) getPosisi()).setZ(((Koordinat3D) getPosisi()).getZ() + k.getZ());
    }

    public void info() {
        System.out.println("Warna : " + getWarna());
        System.out.println("Posisi : " + getPosisi());
    }
}