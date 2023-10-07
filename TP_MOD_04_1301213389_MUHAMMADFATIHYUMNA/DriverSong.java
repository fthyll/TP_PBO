package TP_MOD_04_1301213389_MUHAMMADFATIHYUMNA;

import TP_MOD_04_1301213389_MUHAMMADFATIHYUMNA.art.Song;
import TP_MOD_04_1301213389_MUHAMMADFATIHYUMNA.job.Artist;

public class DriverSong {
    public static void main(String[] args) {
        // Buat dua objek Artist
        Artist a1 = new Artist("Alan Walker", "1997-08-24");
        Artist a2 = new Artist("Ari Lasso", "1973-01-17");

        // Tampilkan info semua objek Artist
        a1.displayInfo();
        System.out.println();
        a2.displayInfo();

        // Buat dua objek Song
        Song song1 = new Song("Not You", a1, "2021-12-03");
        Song song2 = new Song("Hampa", a2, "2003-02-10");

        // Tampilkan info semua objek Song
        System.out.println();
        song1.tampilkanInfo();
        System.out.println();
        song2.tampilkanInfo();
    }
}
