import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<String>(); // Sadece string ifadeyle çalışabiliriz artık
        sehirler.add("Eskişehir");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        sehirler.remove("İzmir"); // index ile de silebiliriz
        Collections.sort(sehirler); // sort sırala demek

        for (String sehir: sehirler) {
        System.out.println(sehir);
        }
    }
}