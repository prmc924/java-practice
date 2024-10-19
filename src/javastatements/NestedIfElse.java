package javastatements;

public class NestedIfElse {

    public static void main(String[] args) {
        int marks = 80;

        if(marks>=80 && marks<=100){
            System.out.println("Distinction");
        }else if (marks>=70 && marks<80){
            System.out.println("First Class");
        }else if(marks>=50 && marks<70){
            System.out.println("Second class");
        }else if(marks>=35 && marks<50){
            System.out.println("Pass");
        }else if(marks>=0 && marks<=35){
            System.out.println("Fail");
        }else {
            System.out.println("Invalid marks");
        }
        System.out.println("My mark is : "+ marks);
    }

}
