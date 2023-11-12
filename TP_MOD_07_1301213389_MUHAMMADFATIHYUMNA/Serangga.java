package TP_MOD_07_1301213389_MUHAMMADFATIHYUMNA;

public class Serangga {
    private final int jmlKaki;
   String warna;
   private final Koordinat posisi;

   public Serangga(int jmlKaki, String warna, Koordinat posisi) {
       this.jmlKaki = jmlKaki;
       this.warna = warna;
       this.posisi = posisi;
   }

   private int getJmlKaki() {
       return jmlKaki;
   }

   public String getWarna() {
       return warna;
   }
   
   public Koordinat getPosisi(){
       return posisi;
   }
}
