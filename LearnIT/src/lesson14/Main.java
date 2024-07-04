package lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String test = "123";
//        String test1 = "Test";
//
//        Integer i = 123;
//
//        Integer test2 = Integer.parseInt(test); //преобразование из строки в число
//        String test3 = String.valueOf(i);   //преобразование из числа в строку
//        System.out.println(test.charAt(0)); //получить элемент по индексу как в массиве
//
//        System.out.println(test2 + 1);
//        System.out.println(test3 + 1);

        String input = new Scanner(System.in).nextLine();

        int lastNumber = Integer.parseInt(String.valueOf(input.charAt(input.length()-1)));

        System.out.println(lastNumber);
    }
}
