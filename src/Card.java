import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Card {

    public void setCard(String str) throws InvalidCardNumderException{

        ArrayList<String> list = new ArrayList<>();
        try (Scanner scan = new Scanner(new File("c.txt"))){
            while (scan.hasNextLine()){
                list.add(scan.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Ошибка при работе с файлом");
        }

        String[] array = list.toArray(new String[0]);
        if (str.length() != 19) {
            throw new InvalidCardNumderException("Карта введена некоректно");
        }else if (str.length() == 19){
            int j = 0;

            while (j < array.length-1 && (str.equalsIgnoreCase(array[j]) == false)){
                j +=1;
            }
            if (str.equals(array[j])){
                throw new InvalidCardNumderException("Карта заблокирована");
            }
        }

    }

}
