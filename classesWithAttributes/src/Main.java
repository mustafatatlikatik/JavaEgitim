public class Main {
    public static void main(String[] args) {
        //Product product = new Product(1123221,"Laptop","Monster Laptop",25000,250,"Siyah"); // aslında bu kullanım yapıcı bloğu çalıştırıyor
        Product product = new Product();
        product.setName("Laptop");
        System.out.println(product.getName());
        product.setId(1123845);     // Üstteki yazımdan dolayı bu şekilde yazmaya gerek kalmıyor
        product.setDescription("Monster Laptop");
        product.setPrice(25000);
        product.setStockAmount(250);
        product.setRenk("Siyah");
        System.out.println(product.getPrice()); //önce eski fiyatını yazdırıyor
        product.setPrice(30000); // fiyatını güncelliyor
        System.out.println(product.getPrice()); // yeni güncel fiyatını yazdırıyor


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}