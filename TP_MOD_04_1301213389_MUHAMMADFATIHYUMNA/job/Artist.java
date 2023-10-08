package TP_MOD_04_1301213389_MUHAMMADFATIHYUMNA.job;

import java.text.ParseException; // untunk menghandle error pada parsing tanggal
import java.text.SimpleDateFormat; // untuk mengubah format tanggal
import java.time.LocalDate; // untuk menghitung usia
import java.time.Period; // untuk menghitung usia
import java.time.format.DateTimeFormatter; // untuk mengubah format tanggal
import java.util.Date; // untuk mengubah format tanggal

public class Artist {
    private String name;
    private String birthdate;

    public Artist(String name, String _birthdate) {
        this.name = name;
        // Ubah _birthdate menjadi format "tgl bulan tahun"
        SimpleDateFormat formatMasukan = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatKeluaran = new SimpleDateFormat("d MMMM yyyy");
        try {
            Date tanggal = formatMasukan.parse(_birthdate);
            this.birthdate = formatKeluaran.format(tanggal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getNama() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public int getUsia() {
        LocalDate birthdate = LocalDate.parse(this.birthdate, DateTimeFormatter.ofPattern("d MMMM yyyy"));
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthdate, currentDate).getYears();
    }

    public void displayInfo() {
        System.out.println("Informasi Artis:");
        System.out.println("Nama: " + name);
        System.out.println("Tanggal Lahir: " + birthdate);
        System.out.println("Usia: " + getUsia() + " tahun");
    }
}
