import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci-> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(4, "empat");

        // Mengambil elemen pertama
        System.out.println(map.get(1));

        // Mengambil keseluruhan kunci sebagai objek collection set
        // Tidak boleh ada duplikasi data
        Set<Integer> key = map.keySet();

        // Iterasi mengambil keseluruhan nilai dari kunci
        for (Integer v : key) {
            System.out.print(map.get(v) + " ");
        }
    }
}
