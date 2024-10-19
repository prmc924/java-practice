package javastatements;

public class IfElseCondtion {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(a<=b){
            System.out.println("If body");
        }else{
            System.out.println("Else body");
        }
        System.out.println("Hello");

        isUmbrellaRequired();

    }

    public static void isUmbrellaRequired(){
        boolean isRainy = true;

        if(isRainy){
            System.out.println("Umbrella is required");
        }else{
            System.out.println("Umbrella is not required");
        }

    }

}
