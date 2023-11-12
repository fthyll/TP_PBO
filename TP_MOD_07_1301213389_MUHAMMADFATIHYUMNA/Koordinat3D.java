package TP_MOD_07_1301213389_MUHAMMADFATIHYUMNA;

public class Koordinat3D extends Koordinat {
    private int z;

    public Koordinat3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}