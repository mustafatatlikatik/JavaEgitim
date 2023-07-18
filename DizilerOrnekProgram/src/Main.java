public class Main {
    public static void main(String[] args) {
        double[] myList = {1, 2, 2.5, 3, 4, 4.5, 5};
        double toplam = 0;
        double enbüyük = 0;
        for (double numara : myList) {
            if (enbüyük < numara) {
                enbüyük = numara;
            }

            toplam = toplam + numara;
            System.out.println(numara);
        }
        System.out.println("En büyük numara =" + enbüyük);
        System.out.println("Sayıların Toplamı =" + toplam);
    }
}