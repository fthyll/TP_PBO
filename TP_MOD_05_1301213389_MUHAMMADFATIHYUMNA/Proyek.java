package TP_MOD_05_1301213389_MUHAMMADFATIHYUMNA;

import java.util.List;
import java.util.ArrayList;

public class Proyek {
    private String namaProyek;
    private List<Mahasiswa> mahasiswaList;
    private Fakultas fakultas;

    public Proyek(String namaProyek, Fakultas fakultas) {
        this.namaProyek = namaProyek;
        this.fakultas = fakultas;
        this.mahasiswaList = new ArrayList<>();
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void addMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }
}

