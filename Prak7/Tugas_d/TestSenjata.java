public class TestSenjata{
    public static void main(String[] args){
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.println("Jumlah Peluru ak47: " + ak47.getPeluru());
        System.out.println("ak47 mengisi peluru ");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru ak47: " + ak47.getPeluru());
        System.out.println("ak47 Menembak");
        ak47.menembak();
    }
}