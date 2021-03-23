import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Card card = new Card();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер карты таким обазом");
        String str = in.nextLine();

        try{
            card.setCard(str);
        }catch (OutOfLimitTransferExcepition e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        Money money = new Money();
        System.out.println("Введите сумму");
        int j = in.nextInt();
        try{
            money.setMoney(j);
        }catch (InvalidCardNumderException e) {
            System.err.println(e.getMessage());
        }
        in.close();
    }
}
