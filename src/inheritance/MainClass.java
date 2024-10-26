package inheritance;

public class MainClass extends ChildClass{

    public MainClass(int a){
        super(a);
    }

    public void m5(){
        System.out.println("This is main class m5 method");
    }

    public static void main(String[] args) {

        MainClass mainClass = new MainClass(5);
        mainClass.m1();
        mainClass.m2();
        mainClass.m3();
        mainClass.m4();
        mainClass.m5();


    }


}
