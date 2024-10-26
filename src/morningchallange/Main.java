package morningchallange;

/**
 * Created by Jay Vaghani
 */
public class Main {

    public static void main(String[] args) {
        Challenge3 emp1 = new Challenge3(101, 10,"John", "Manual Tester");
        emp1.display();
        Challenge3 emp2 = new Challenge3(102, 12, "Smith", "Automation Tester");
        emp2.display();
        emp1.display();
    }
}
