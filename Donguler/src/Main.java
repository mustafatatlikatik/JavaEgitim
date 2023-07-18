public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); //1 ile 10 arasındaki sayıları yazdırdık

        }
        System.out.println("For döngüsü bitti");
        int i = 2;
        while (i <= 10) {
            System.out.println(i);//1 ile 10 arasındaki çift sayıları yazdırdık
            i += 2;

        }
        System.out.println("While döngüsü bitti");
        int j = 1;
        do {
            System.out.println(j);//1 ile 10 arasındaki tek sayıları yazdırdık
            j += 2;
        }
        while (j <= 10);
        System.out.println("Do While döngüsü bitti");
    }
}