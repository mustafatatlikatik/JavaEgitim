import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String ,String>();
        sozluk.put("book","kitap"); // sağ taraf değer sol taraf anahtar değeri görüyor
        sozluk.put("pen","kalem");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        sozluk.put("headset","kulaklık");
        System.out.println(sozluk.size());
        for (String item: sozluk.keySet()) { // keySet anahtar değeri döndürüyor
            System.out.println("Eleman-"+item.toUpperCase()+" Değer-"+sozluk.get(item).toUpperCase());
        }

        System.out.println("/n**************************************/n");

        sozluk.remove("table");
        System.out.println(sozluk.get("table")); // null değeri döner ve karşılığı yok demektir
        sozluk.clear(); // bütün sözlüğü siler
        System.out.println("Sözlük başarı ile temizlendi.");
        System.out.println(EMessage.HATA);
        System.out.println(EMessage.ISLEM);
        System.out.println(EMessage.MESAJ.MESAJ());
    }
}