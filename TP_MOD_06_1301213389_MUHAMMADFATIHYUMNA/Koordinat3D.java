package TP_MOD_06_1301213389_MUHAMMADFATIHYUMNA;


public class Koordinat3D extends Koordinat {
    private double z;

    public Koordinat3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double hitungJarak(Koordinat other) {
        if (other instanceof Koordinat3D) {
            Koordinat3D other3D = (Koordinat3D) other;
            double dx = getX() - other3D.getX();
            double dy = getY() - other3D.getY();
            double dz = z - other3D.getZ();
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        } else {
            return super.hitungJarak(other);
        }
    }
}
