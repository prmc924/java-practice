package methodtypes;

public class WithReturnTypeWithParameters {

    public static int addition(int a, int b){
        int result = a + b;
        return result;
    }

   public String name(String courseName){
        return courseName;
   }

   public static void main(String[] args) {
       int ans = addition(20,30);
        System.out.println(ans);
        System.out.println(addition(5,5));
        System.out.println(addition(50,50));

        WithReturnTypeWithParameters test = new WithReturnTypeWithParameters();
        test.name("Java");
        System.out.println(test.name("Java"));



    }


}
