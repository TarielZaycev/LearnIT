package lesson22;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<String> todos = new ArrayList<>();

    public static void main(String[] args) {
        addToDo("дело номер1");
        addToDo("дело номер1");
        addToDo("дело номер2");
        addToDo("дело номер3");
        delete("дело номер1");
        printByIndex(1);
        printAll();
    }

    public static void addToDo(String todo){
        if (!todos.contains(todo)){
            todos.add(todo);
        }
    }

    public static void delete(String todo){
        todos.remove(todo);
    }

    public static void printAll(){
        todos.forEach(System.out::println);
    }

    public static void printByIndex(int i){
        System.out.println("Дело по индексу: " + todos.get(i));
    }
}
