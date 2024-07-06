package lesson23;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static Set<String> word = new TreeSet<>();
    private static boolean isContinue = true;
    public static void main(String[] args) {
        while (isContinue){
            System.out.println("Введите 1 если хотите добавить слово\nВведите 2 если хотите удалить слово\n" +
                    "Введите 3 если хотите получить все слова\nВведите 4 если хотите выйти из программы");
            int inputNumber = new Scanner(System.in).nextInt();

            switch (inputNumber){
                case 1:
                    System.out.println("Введите слово, которое хотите добавить");
                    word.add(new Scanner(System.in).nextLine().trim());
                    break;
                case 2:
                    System.out.println("Введите слово, которое хотите удалить");
                    word.remove(new Scanner(System.in).nextLine().trim());
                    break;
                case 3:
                    for(String s: word){
                        System.out.println(s);
                    }
                    break;
                case 4:
                    isContinue = false;
                    break;
            }

        }
    }
}
