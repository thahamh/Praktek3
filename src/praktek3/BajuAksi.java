package praktek3;
public class BajuAksi {
    public static void main(String[] args) {
       Baju b = new Baju();
      
       b.setMerk("Oto Ono");
       b.setWarna("Biru");
       b.setUkuran("L");
       b.setHarga(350);
       
       
       b.cetakInfo();
       
       System.out.println("Merknya \t: ");
       System.out.println(b.getMerk());
       System.out.println("Warnanya \t: ");
       System.out.println(b.getWarna());
       System.out.println("Ukurannya \t: ");
       System.out.println(b.getUkuran());
       System.out.println("Harganya \t: ");
       System.out.println(b.getHarga());
    }
}
