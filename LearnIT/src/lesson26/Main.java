package lesson26;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        printer(x -> System.out.println(x));
//    }
//
//    public static void printer(Test test){
//        test.process(25);

//        List<String> strings = new ArrayList<>();
//        strings.add("Первый");
//        strings.add("Второй");
//        strings.add("Третий");

//        strings.stream()
//                .filter(x -> !x.equals("Первый"))
//                .filter(x -> !x.equals("Третий"))
//                .forEach(x -> System.out.println(x));

//        Set<String> collect = strings.stream()
//                .filter(x -> !x.equals("Первый"))
//                .collect(Collectors.toSet());
//
//        collect.forEach(System.out::println);

        Map<String, Map<String, Integer>> example = new HashMap<>();
        Map<String, Integer> test1 = new HashMap<>();
        test1.put("Первый", 1);
        test1.put("Второй", 2);
        test1.put("Третий", 3);
        Map<String, Integer> test2 = new HashMap<>();
        test2.put("Первый", 4);
        test2.put("Второй", 5);
        test2.put("Третий", 6);
        Map<String, Integer> test3 = new HashMap<>();
        test3.put("Первый", 7);
        test3.put("Второй", 8);
        test3.put("Третий", 9);

        example.put("Первый",test1);
        example.put("Второй",test2);
        example.put("Третий",test3);

        example.entrySet()
                .stream()
                .flatMap(s-> s.getValue().values().stream())
                .forEach(System.out::println);

    }
}
