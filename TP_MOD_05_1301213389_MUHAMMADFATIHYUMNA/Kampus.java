package TP_MOD_05_1301213389_MUHAMMADFATIHYUMNA;

import java.util.List;
import java.util.ArrayList;

public class Kampus {
    private String namaKampus;
    private Mahasiswa presiden;
    private List<Fakultas> fakultasList;

    public Kampus(String namaKampus) {
        this.namaKampus = namaKampus;
        this.fakultasList = new ArrayList<>();
    }

    public String getNamaKampus() {
        return namaKampus;
    }

    public Mahasiswa getPresiden() {
        return presiden;
    }

    public void setPresiden(Mahasiswa presiden) {
        this.presiden = presiden;
    }

    public List<Fakultas> getFakultasList() {
        return fakultasList;
    }

    public void addFakultas(Fakultas fakultas) {
        fakultasList.add(fakultas);
    }
}

