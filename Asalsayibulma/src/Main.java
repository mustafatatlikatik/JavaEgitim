import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        int sayi = input.nextInt();
        boolean asaldir = true;


        if (sayi == 1 || sayi < 1) {
            System.out.println("Geçersiz sayı girdiniz");
            return;

        }
        if (sayi == 2) {
            System.out.println("2 en küçük ve tek çift asal sayıdr");
            return;
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asaldir = false;
            }
        }
        if (asaldir) {
            System.out.println("Sayı Asaldır");

        } else {
            System.out.println("Sayı asal değidir");
        }

    }
}