package variables;

public class InstanceVariables {
    private int a = 10; // a is a instance variable or Global variable
    String name = "Prime Testing";

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println("m1 method starts");
        obj.m1();

    }

    private void m1() {
        System.out.println(a);
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(name);
        System.out.println(obj.name);

    }


}
