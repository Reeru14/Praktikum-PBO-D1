import java.util.*;
public class MapTest {
    /**
     * main
     */
    public static void main(String[] args) {
        //kunci
        Map<String, String> map = new HashMap<String,String>();
        //Menempatkan elemen kunci dan nilai
        map.put("sunan", "kntl");
        map.put("farell", "ganteng");
        //Mengambil elemen pertama
        Scanner myObj = new Scanner(System.in);
        String s = myObj.nextLine();
        System.out.println(map.get(s));
        //Mengambil keseluruhan kunci sebagai objek
        Set<String> key = map.keySet();
        //Iterasi
        // for(String k : key){
        //     System.out.print(k+" ");
        // }
    }
}
