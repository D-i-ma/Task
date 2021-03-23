
public class BankOnlineException extends Exception{
    String message;

    public BankOnlineException(String msg) {
        this.message = msg;
        System.err.println("Ошибка: " + message);
    }


}
