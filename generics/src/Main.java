import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { //type güvenli çalışmak için genericleri kullanıyoruz

        /*ArrayList<String> sehirler=new ArrayList<String>(); // generik olduğu zaman farklı tiplerle çalışan class oluyor
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("İstanbul");*/
        MyList<Customer> sehirler = new MyList<Customer>(); // soldaki MyList'e customer yazmamıza gerek yok ama kod okunurluğu açısından yazabilirsin
        sehirler.add(new Customer());
        sehirler.add(new Customer());
        sehirler.remove(new Customer());

    }
}