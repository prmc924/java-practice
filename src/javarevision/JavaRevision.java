package javarevision;

/**
 * Created by Jay Vaghani
 */
public class JavaRevision {

    String name;
    int value;

    public JavaRevision() {
        System.out.println("No args Cons");
    }

    public JavaRevision(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public int getValue(){
        return this.value;
    }

    public static JavaRevision getInstance(){
        JavaRevision javaRevision = new JavaRevision();
        return javaRevision;
    }

    public static JavaRevision getInstance(String name, int value){
        JavaRevision javaRevision = new JavaRevision(name, value);
        return javaRevision;
    }

    public static void main(String[] args) {
        JavaRevision obj = getInstance();
        JavaRevision obj1 = getInstance("Jay", 123);
        System.out.println(obj1.getName());
        System.out.println(obj1.getValue());
    }
}
