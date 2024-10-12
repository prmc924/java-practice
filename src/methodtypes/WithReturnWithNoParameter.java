package methodtypes;

public class WithReturnWithNoParameter {


    public static int addition(){
        int a = 10;
        int b = 20;
        int c = 100;
        String name = "Prime";
        int ans = a +b;
        return ans;
    }

    public String myName(){
        String firstName = "Amit";
        String lastName = "Kathrotiya";
        return firstName+ " "+lastName;
    }

    public static boolean isRight(){
        boolean a =  true;
        boolean b = false;
        return a;

    }

    public static void main(String[] args) {
        int result =  addition();
        System.out.println(result);
        System.out.println(addition());
        WithReturnWithNoParameter obj = new WithReturnWithNoParameter();
        System.out.println(obj.myName());

        System.out.println(isRight());
    }

}
