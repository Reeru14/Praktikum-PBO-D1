public class KontrolSenjata{
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambahkan: " + jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!this.isAdaPeluru()){
            System.out.println("Peluru Habis");
        }else {
            for(int i=0;i<jumlah;i++){
                if (this.isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru()-1);
                }
                else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }
    
    public String menusuk(){
        if (senjata.isMenusuk()){
            return "JLEB";
        }else {
            return "Gagal menusuk, bayonet belum terpasang";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
}