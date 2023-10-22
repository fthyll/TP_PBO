package TP_MOD_06_1301213389_MUHAMMADFATIHYUMNA;

public class KoordinatLingkaran extends Koordinat {
    private double radius;

    public KoordinatLingkaran(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isBersinggungan(KoordinatLingkaran other) {
        double distance = hitungJarak(other);
        return distance <= radius + other.getRadius();
    }
}


