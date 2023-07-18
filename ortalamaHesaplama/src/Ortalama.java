import java.util.Scanner;

public class Ortalama {
      void ortalamaBul(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Vize Notunuzu Giriniz");
            double vize = scanner.nextInt()*0.2;
            System.out.println("Ödev Notunuzu Giriniz");
            double odev= scanner.nextInt()*0.2;
            System.out.println("Final Notunuzu Giriniz");
            double finall = scanner.nextInt()*0.6;
            double ortalama = vize+odev+finall;
            System.out.println("Ortalamanız = "+ortalama);

    }
}
