public class Money {

    public void setMoney(int i) throws InvalidCardNumderException{

        if (i < 0) {
            throw new InvalidCardNumderException("Сумма отрицательна");
        }
        else if (i > 50000){
            throw new InvalidCardNumderException("Лимит привышен");
        }

    }

}
