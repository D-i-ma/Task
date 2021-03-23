import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Card {

    public void setCard(String str) throws OutOfLimitTransferExcepition {

        Pattern r = Pattern.compile("^[0-9]*$");
        Matcher m = r.matcher(str);

        ArrayList<String> list = new ArrayList<>();
        try (Scanner scan = new Scanner(new File("c.txt"))){
            while (scan.hasNextLine()){
                list.add(scan.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Ошибка при работе с файлом");
        }

        String[] array = list.toArray(new String[0]);
        if (str.length() != 16) {
            throw new OutOfLimitTransferExcepition("Карта введена некоректно");
        }else if (str.length() == 16){
            if (m.find( ) == false){

                throw new OutOfLimitTransferExcepition("Карта введена некоректно");
            }else {
                int j = 0;

                while ((j < array.length - 1) && (str.equalsIgnoreCase(array[j]) == false)) {
                    j += 1;
                }
                if (str.equals(array[j])) {
                    throw new OutOfLimitTransferExcepition("Карта заблокирована");
                }
            }
        }

    }

}
