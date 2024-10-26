package blocks;

public class StaticBlocks {
    static String empName;

    static {
        System.out.println("This is a static block");
        empName = "David";
    }

    public static void main(String[] args) {
        System.out.println("This is a main method");
        System.out.println(empName);
    }



}
