package TP_MOD_03_1301213389_MUHAMMADFATIHYUMNA.Soal_1;

public class DriverAlbum {
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("Hello World");
        song1.addArtist("Alan Walker");
        song1.addArtist("Torine");
        song1.setDuration(171);

        Song song2 = new Song();
        song2.setTitle("Film Favorit");
        song2.addArtist("Sheila On 7");
        song2.setDuration(226);

        Album album = new Album();
        album.setTitle("Kayaknya Hits");
        album.setYear(2023);
        album.addSong(song1);
        album.addSong(song2);

        album.displayInfo();
    }
}

// Muhammad Fatih Yumna Lajuwirdi Lirrahman 1301213389