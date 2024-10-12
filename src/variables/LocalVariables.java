package variables;

public class LocalVariables {
    /**
     * Local variable - declared inside the method or in the constructor
     * scope          - within the method
     * memory allocation - when method starts
     * Memory         - stack
     */

    public static void main(String[] args) {
        // a is a local varibale
        int a =5;
        System.out.println(a);
        a= 10;
        System.out.println(a);
        String name = "Prime";
        System.out.println();

    }

   public void myMethod(){
        int x =50;
       System.out.println(x);
        boolean result = false;
   }



}
