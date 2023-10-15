package TP_MOD_05_1301213389_MUHAMMADFATIHYUMNA;

import java.util.List;
import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private List<Proyek> proyekList;
    private Kampus kampus;

    public Mahasiswa(String nama, Kampus kampus) {
        this.nama = nama;
        this.kampus = kampus;
        this.proyekList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public List<Proyek> getProyekList() {
        return proyekList;
    }

    public void addProyek(Proyek proyek) {
        proyekList.add(proyek);
    }
}

