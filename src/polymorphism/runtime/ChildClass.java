package polymorphism.runtime;

public class ChildClass extends ParentClass{

    public void calculation(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

    }

    private void addition(int a,int b){
        System.out.println(a+b);
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.addition(10,5);
        obj.calculation(2,3);
    }

}
