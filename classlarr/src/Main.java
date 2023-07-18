public class Main {
    public static void main(String[] args) {
        // reference type , refereans tipi
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //int string gibi ifadeler value yani değer tiplidir stack içinde bulunur heap içine gitmez
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1; //sayi2'nin değeri sayi1'in değeri oluyor
        sayi1=30; // sayi1'in değeri 30 diyoruz ama sayi2 değişmiyor
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3}; //diziler bu şekilde de yazılabilir
        int[] sayilar2 = {4,5,6}; // bu şekilde de yazılabilir aynısıdır
        sayilar2=sayilar1; // diziler referans tiplidir
        sayilar1[0]=10; //o yüzden stack'ten alıp heap'te değiştirdi ve sayilar 2'nin referansı sayilar1'in referans numarası oldu
        System.out.println(sayilar2[0]);
    }
}