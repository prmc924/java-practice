package methodtypes;

public class NoReturnNoParameters {

    public static void main(String[] args) {
        addition();
        NoReturnNoParameters np = new NoReturnNoParameters();
        np.subtraction();
        np.multiplication();
        np.devison();

    }

    //No return No params
    public static void addition() {
        int a = 5;
        int b = 10;
        int ans = a + b;
        // concatenation
        System.out.println("Addition of two number " + a + " and " + b + " is " + ans + ".");
    }

    // subtraction, perenthesis
    public void subtraction() {
        int a = 10;
        int b = 2;
        int ans = a - b;
        System.out.println("Subtraction of two numbers " + a + " and " + b + " is " + ans);
    }

    //multiplication
    void multiplication() {

    }
    //devision
    public void devison(){

    }


}