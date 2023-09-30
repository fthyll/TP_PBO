package TP_MOD_03_1301213389_MUHAMMADFATIHYUMNA.Soal_1;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private int year;
    private List<Song> songs;

    public Album() {
        songs = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void displayInfo() {
        System.out.println("Album Info");
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Song List");

        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            System.out.println((i + 1) + ". Title: " + song.getTitle());
            System.out.println("   Artist: " + String.join(", ", song.getArtist()));
            System.out.println("   Duration: " + song.getDuration());
        }
    }
}

// Muhammad Fatih Yumna Lajuwirdi Lirrahman 1301213389