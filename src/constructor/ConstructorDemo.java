package constructor;

public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("Zero param constructor");
    }
    public ConstructorDemo(int a){
        System.out.println("1 param constructor");
    }
    public ConstructorDemo(String name){
        System.out.println("1 param constructor "+name);
    }
    public ConstructorDemo(int a, int b){
        System.out.println("2 params constructor");
    }

    public void addition(){
        System.out.println("This is a method");
    }
    public static void main(String[] args) {
        //Constructor is called when object is created
        ConstructorDemo t = new ConstructorDemo();
        ConstructorDemo t1 = new ConstructorDemo(10);
        ConstructorDemo t2 = new ConstructorDemo("Java");
        ConstructorDemo t3 = new ConstructorDemo(2,3);

        t.addition();
        t1.addition();


    }
}
