package lesson17;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        date.setDate(5);
//        date.setYear(124);
//        date.setMonth(Calendar.JULY);

//        Calendar date = Calendar.getInstance();
//        date.set(2024,Calendar.JULY, 5,13,13);
//        date.add(Calendar.YEAR,2);
//        System.out.println(date.getTime());

//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        System.out.println(localTime);
//        System.out.println(localDate);
//        System.out.println(dateTime);

//        String input = new Scanner(System.in).nextLine().trim();
//        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
//
//        Date parse = dateFormat.parse(input);
//        System.out.println(parse);

//        Date date = new Date();
//        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//
//        System.out.println(dateFormat.format(date));

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");

        System.out.println(timeFormatter.format(localDate));
    }
}
