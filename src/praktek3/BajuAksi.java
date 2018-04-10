package praktek3;
public class BajuAksi {
    public static void main(String[] args) {
       Baju b = new Baju();
      
       b.setMerk("Oto Ono");
       b.setWarna("Biru");
       b.setUkuran("L");
       b.setHarga(350);
       //gak bisa b.setJenisKemeja();
       
       
       b.cetakInfo();
       
       System.out.println("Merknya \t: ");
       System.out.println(b.getMerk());
       System.out.println("Warnanya \t: ");
       System.out.println(b.getWarna());
       System.out.println("Ukurannya \t: ");
       System.out.println(b.getUkuran());
       System.out.println("Harganya \t: ");
       System.out.println(b.getHarga());
       
       BajuKemeja bk = new BajuKemeja();
       bk.setMerk("Vaneda");
       bk.setWarna("Merah");
       bk.setUkuran("XL");
       bk.setHarga(450);
       bk.setJenisKemeja("Hem");
       
       bk.cetakInfo();
       System.out.println("Jenis \t: "+bk.getJenisKemeja());
       bk.throttle();
    }
}
