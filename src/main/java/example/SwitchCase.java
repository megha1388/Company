package example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SwitchCase {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        String day = dateFormat.format(date);
        switch (day){
            case "Monday":
                System.out.println("one");
                break;
            case "Tuesday":
                System.out.println("two");
                break;
            case "wednesday":
                System.out.println("three");
                break;
            case "thursday":
                System.out.println("four");
                break;
            case "Friday":
                System.out.println("five");
                break;
            default:
                System.out.println(day);
        }
    }
}
