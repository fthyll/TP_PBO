package TP_MOD_05_1301213389_MUHAMMADFATIHYUMNA;

import java.util.List;
import java.util.ArrayList;

public class Departemen {
    private String namaDepartemen;
    private List<Mahasiswa> mahasiswaList;
    private List<Proyek> proyekList;

    public Departemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
        this.mahasiswaList = new ArrayList<>();
        this.proyekList = new ArrayList<>();
    }

    public String getNamaDepartemen() {
        return namaDepartemen;
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void addMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }

    public List<Proyek> getProyekList() {
        return proyekList;
    }

    public void addProyek(Proyek proyek) {
        proyekList.add(proyek);
    }
}

