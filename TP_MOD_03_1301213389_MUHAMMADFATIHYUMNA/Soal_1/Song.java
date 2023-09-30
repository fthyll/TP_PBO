package TP_MOD_03_1301213389_MUHAMMADFATIHYUMNA.Soal_1;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String title;
    private List<String> artist;
    private int duration;

    public Song() {
        artist = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addArtist(String artistName) {
        artist.add(artistName);
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getArtist() {
        return artist;
    }

    public String getDuration() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}

// Muhammad Fatih Yumna Lajuwirdi Lirrahman 1301213389