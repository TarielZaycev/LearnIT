package lesson24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Map<String, Integer> humans = new TreeMap<>();
//        humans.put("Тариэл", 27);
//        humans.put("Ирина",33);

//        for (Map.Entry<String, Integer> entry: humans.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

//        for (Integer age: humans.values()){
//            System.out.println(age);
//        }

        Map<String, Set<String>> todos = new HashMap<>();
        Set<String> petyaTodos = new TreeSet<>();
        petyaTodos.add("Купить молока");
        petyaTodos.add("Купить колбасы");

        Set<String> vasyaTodos = new TreeSet<>();
        vasyaTodos.add("Купить акций");
        vasyaTodos.add("Купить крипту");

        todos.put("Петя",petyaTodos);
        todos.put("Вася", vasyaTodos);

//        for (Map.Entry<String, Set<String>> todo: todos.entrySet()){
//            String name = todo.getKey();
//            System.out.println(name);
//            for (String del: todo.getValue()){
//                System.out.println("\t" + del);
//            }
//        }

        for (Map.Entry<String, Set<String>> todo: todos.entrySet()){
            for (String del: todo.getValue()){
                if (del.equals("Купить молока")){
                    System.out.println(del + " содержится в делах " + todo.getKey());
                }
            }
        }
    }
}
