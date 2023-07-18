public class Product { // public her yerden erişilebilir demektir

    //constructor ekledik ama zaten default olarak var yazmak ile yazmamak arasında hiçbir fark yok
    public Product(int id, String name, String description, double price, int stockAmount, String renk) {  // productı sadece bu parametreleri verirsen kullandırırım demek
        System.out.println("Yapıcı block çalıştı");
        this.id = id;
        this.name = name;
        this.price = price;
        this.renk = renk;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product() { // Bununla getter ve setterları kullanabiliyoruz ve buna overload deniyor

    }

    //attribute | field deniyor
    private int id; //private sadece tanımlandığı blockta geçerli demektir
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public int getId() { //bu bloğa getter denir
        //id'yi değiştiremez ama okuyabilir yani read only
        return id;
    }

    public void setId(int id) { //bu bloğa setter denir
        this.id = id; //this içerisinde bulunduğum class demek
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

}
