package TP_MOD_04_1301213389_MUHAMMADFATIHYUMNA.art;

import TP_MOD_04_1301213389_MUHAMMADFATIHYUMNA.job.Artist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Song {
    private String title;
    private Artist artist;
    private String release;

    public Song(String title, Artist artist, String _release) {
        this.title = title;
        this.artist = artist;
        // Ubah _release menjadi format "tgl bulan tahun"
        SimpleDateFormat formatMasukan = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatKeluaran = new SimpleDateFormat("d MMMM yyyy");
        try {
            Date tanggal = formatMasukan.parse(_release);
            this.release = formatKeluaran.format(tanggal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void tampilkanInfo() {
        System.out.println("Informasi Lagu:");
        System.out.println("Judul: " + title);
        System.out.println("Artis: " + artist.getNama());
        System.out.println("Tanggal Rilis: " + release);
        System.out.println("Usia Artis saat lagu dirilis: " + artist.getUsia() + " tahun");
    }
}
