package TP_MOD_06_1301213389_MUHAMMADFATIHYUMNA;

public class Koordinat {
    private double x;
    private double y;

    public Koordinat(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double hitungJarak(Koordinat other) {
        double dx = x - other.x;
        double dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

