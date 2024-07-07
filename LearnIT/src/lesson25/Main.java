package lesson25;

import java.util.Scanner;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        Test test = (x) -> {
//            System.out.println(x);
//            x++;
//            System.out.println(x);
//        };
//
//        test.print(10);

//        Predicate<Integer> isPositive = (x) -> x > 0;
//        System.out.println(isPositive.test(15));

//        BinaryOperator<Integer> multiply = (x, y) -> x + y;
//        System.out.println(multiply.apply(5, 20));

//        UnaryOperator<Integer> square = (x) -> x * x;
//        System.out.println(square.apply(2));

//        Function<Integer, String> converter = (x) -> String.valueOf(x);
//        System.out.println(converter.apply(10) + 1);

//        Consumer<Integer> printed = (x) -> System.out.println(x);
//        printed.accept(10);

        Supplier<String> stringSupplier = () -> {
            System.out.println("Введите строку: ");
            return new Scanner(System.in).nextLine().trim();
        };

        System.out.println(stringSupplier.get());
    }
}
