public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla (double tutar){ //burada BaseKrediManager üzerindeki hesaplayı override yapıyoruz ve üzerine yazıyor
        return tutar*1.10;
    }
}
