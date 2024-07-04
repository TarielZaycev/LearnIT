package lesson16;

public class Main {
    public static void main(String[] args) {
        String info = "Молоко: 250, Вода: 50, Хлеб: 20";

        info = info.replaceAll("\\D", " ").trim();
        info = info.replaceAll("\\s{2,}", " ");
        String[] s = info.split("\\s");
        int sum = 0;
        for (String e : s) {
            sum += Integer.parseInt(e);
        }

        System.out.println(sum);

//        System.out.println(info.replaceAll("(\\d{4})(\\d{3})","$1 : $2"));
        //[А-я] - все русские буквы
        //[А-я]{3,} - от 3 до бесконечности вхождений
    }
}
