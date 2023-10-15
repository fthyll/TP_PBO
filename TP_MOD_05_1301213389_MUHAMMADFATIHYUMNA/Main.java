package TP_MOD_05_1301213389_MUHAMMADFATIHYUMNA;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan kelas-kelas dan relasi di sini
        Kampus kampus1 = new Kampus("Kampus 1");
        Kampus kampus2 = new Kampus("Kampus 2");

        Mahasiswa mahasiswa1 = new Mahasiswa("Mahasiswa 1", kampus1);
        Mahasiswa mahasiswa2 = new Mahasiswa("Mahasiswa 2", kampus1);
        Mahasiswa mahasiswa3 = new Mahasiswa("Mahasiswa 3", kampus2);

        kampus1.setPresiden(mahasiswa1);

        Fakultas fakultas1 = new Fakultas("Fakultas 1");
        Fakultas fakultas2 = new Fakultas("Fakultas 2");

        kampus1.addFakultas(fakultas1);
        kampus1.addFakultas(fakultas2);

        Proyek proyek1 = new Proyek("Proyek 1", fakultas1);
        Proyek proyek2 = new Proyek("Proyek 2", fakultas2);

        fakultas1.addProyek(proyek1);
        fakultas2.addProyek(proyek2);

        mahasiswa1.addProyek(proyek1);
        mahasiswa2.addProyek(proyek1);
        mahasiswa3.addProyek(proyek2);
    }
}
