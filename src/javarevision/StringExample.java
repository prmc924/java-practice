package javarevision;

/**
 * Created by Jay Vaghani
 */
public class StringExample {

    public static void main(String[] args) {
        String date = "16 Nov 2024";
        String [] a = date.split(" "); // String [] a = ["16", "Nov", "2024"]
        String day = a[0];
        String month = a[1];
        String year = a[2];
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }
}
