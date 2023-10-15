package TP_MOD_05_1301213389_MUHAMMADFATIHYUMNA;

import java.util.List;
import java.util.ArrayList;

public class Fakultas {
    private String namaFakultas;
    private List<Proyek> proyekList;
    private List<Departemen> departemenList;

    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.proyekList = new ArrayList<>();
        this.departemenList = new ArrayList<>();
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public List<Proyek> getProyekList() {
        return proyekList;
    }

    public void addProyek(Proyek proyek) {
        proyekList.add(proyek);
    }

    public List<Departemen> getDepartemenList() {
        return departemenList;
    }

    public void addDepartemen(Departemen departemen) {
        departemenList.add(departemen);
    }
}
