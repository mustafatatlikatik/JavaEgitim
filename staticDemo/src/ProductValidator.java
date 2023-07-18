public class ProductValidator {
    public static boolean isValid(Product product){ // bir metodu static yaptığımızda class ismiyle direk çağırılır
        if (product.price>0 && !product.name.isEmpty()){
            return true;
         }else {
            return false;
        }

    }

}
