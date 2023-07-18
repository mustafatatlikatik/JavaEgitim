public abstract class GameCalculator { // gameOver'ı kim kullanıyorsabu asla değişmeyecek bi kuraldır
    public abstract void hesapla(); //hesaplayı kim inherite ediyorsa hesaplayı override yapmak zorunda
    public final void gameOver(){ //bu hiçbir zaman değişmeyecek bir kuraldır
        System.out.println("Oyun bitti");
    }
}
