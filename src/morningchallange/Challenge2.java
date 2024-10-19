package morningchallange;

/**
 * Created by Jay Vaghani
 */
public class Challenge2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Challenge2 obj = new Challenge2();
        obj.productOfTwoNumber(num1, num2);
    }

    public void productOfTwoNumber(int num1, int num2) {
        int ans = num1 * num2;
        System.out.println(num1 + " X " + num2 + " = " + ans);
    }
}
