package TP_MOD_07_1301213389_MUHAMMADFATIHYUMNA;

public class Lebah extends Serangga {
    public Lebah(String warna , int x, int y, int z) {
        super(6, warna, new Koordinat3D(x, y, z));
    }

    public void gerak(int[] koordinat) {
        if (koordinat.length >= 3) {
            Koordinat3D posisi = (Koordinat3D) super.getPosisi();
            posisi.setX(koordinat[0]);
            posisi.setY(koordinat[1]);
            posisi.setZ(koordinat[2]);
        }
    }
    
    public void terbang(int x, int y, int z){
        Koordinat3D posisi = (Koordinat3D) super.getPosisi();
        posisi.setX(posisi.getX() + x);
        posisi.setY(posisi.getY() + y);
        posisi.setZ(posisi.getZ() + z);
    }
   
    public void info() {
        Koordinat3D posisi = (Koordinat3D) super.getPosisi();
        System.out.println("Posisi Lebah : ");
        System.out.println("x = " + posisi.getX());
        System.out.println("y = " + posisi.getY());
        System.out.println("z = " + posisi.getZ());
        System.out.println("");
    }
    
}
