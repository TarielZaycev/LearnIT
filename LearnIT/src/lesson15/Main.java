package lesson15;

import java.util.Scanner;

public class Main {
    private static final String CORRECT_CHARS = " абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
//        char a = 97;
//        System.out.println(a); //код в ASCI
        //1 - ввод только русских маленьких букв
        //2 - не больше двух слов
        //3 - возвращать второе слово
        boolean isValid = true;
        int spaceCount = 0;
        System.out.println("Введите строку: ");
        String input = new Scanner(System.in).nextLine().trim();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
            if (!CORRECT_CHARS.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
            }
        }

        if (isValid && spaceCount == 1) {
            System.out.println(input.substring(input.indexOf(' ')).trim());
        } else {
            System.out.println("Строка не валидна");
        }
    }
}
