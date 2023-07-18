public class Main {
    public static void main(String[] args) {
        AccountManager accountManager=new AccountManager();
        System.out.println("Hesap = "+accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Hesap = "+accountManager.getBalance());
        try {
            accountManager.withdraw(90);
            System.out.println("Hesap = "+accountManager.getBalance());
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        try {
            accountManager.withdraw(20);
            System.out.println("Hesap = "+accountManager.getBalance());
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

    }
}