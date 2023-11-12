package TP_MOD_09_1301213389_MUHAMMADFATIHYUMNA;

public abstract class Serangga {
    private String warna;
    private Koordinat posisi;

    public Serangga(String warna, Koordinat posisi) {
        this.warna = warna;
        this.posisi = posisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Koordinat getPosisi() {
        return posisi;
    }

    public void setPosisi(Koordinat posisi) {
        this.posisi = posisi;
    }

    public abstract void gerak(Koordinat k);

    public abstract void info();
}