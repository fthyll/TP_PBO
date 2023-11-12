package TP_MOD_07_1301213389_MUHAMMADFATIHYUMNA;

public class Semut extends Serangga{
    public Semut(String warna, int x, int y) {
       super(6, warna, new Koordinat(x, y));
   }
   
   public void gerak(int[] koordinat){
      if (koordinat.length >= 2) {
           Koordinat newPosisi = new Koordinat(koordinat[0], koordinat[1]);
           super.getPosisi().setX(newPosisi.getX());
           super.getPosisi().setY(newPosisi.getY());
       }
   }

   public void info() {
       Koordinat posisi = super.getPosisi();
       System.out.println("Posisi Semut :");
       System.out.println("x = " + posisi.getX());
       System.out.println("y = " + posisi.getY());
   }
}
