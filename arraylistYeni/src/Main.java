import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Eskişehir");
        System.out.println(sayilar.size()); // arraylist içinde kaç eleman var onu yazdırıyor
        System.out.println(sayilar.get(2)); // arraylist içindeki 3.elemanı yazdırıyor
        sayilar.set(0,100); // arraylist içindeki 1. elemanı 100 ile değiştiriyor
        System.out.println(sayilar.get(0));
        sayilar.remove(0); // ilk değeri silince 2. değer ilk değer olur yani sola doğru kayar
        System.out.println(sayilar.get(0));
        //sayilar.clear(); // tüm elemanları siler
        System.out.println("-------------");
        for (Object i : sayilar){
            System.out.println(i);
        }
    }
}