package iterationstatements;

public class ForLoopExample {


    public static void main(String[] args) {
        String [] months = {"January", "February", "Mars", "April", "May"};
        String [] cars   = {"BMW", "Audi"};

//        for(int i =0; i<months.length; i++){
//            System.out.println(months[i]);
//        }
//
//        for(int i=0; i<cars.length; i++ ){
//            System.out.println(cars[i]);
//        }

           for(String  month  : months){
               System.out.println(month);
           }

           for(String carName : cars){
               if(carName== "Audi"){
                   System.out.println(carName + " is available");
               }

           }


    }


}
