package constructor;

public class ConstructorExample {
    //instance variable/blobal variable
    int empID;  //10
    String empName;// Rajesh

    public ConstructorExample(int empID, String empName){
             this.empID = empID;
             this.empName = empName;
    }

    public static void main(String[] args) {
        ConstructorExample t = new ConstructorExample(10, "Rajesh");
        t.display();
        ConstructorExample t1 = new ConstructorExample(100, "David");
        t1.display();
        t.display();
    }

    public void display(){
        System.out.println(empID);
        System.out.println(empName);
    }

}
