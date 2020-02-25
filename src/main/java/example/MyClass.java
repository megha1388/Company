package example;

public class MyClass {
    public static void main(String[] args) {
//        int increment = 5;
//        while (increment < 5) {
//            System.out.println(increment);
//            increment++;
//        }
//
//        int decrement = 5;
//        do {
//            System.out.println(decrement);
//            decrement++;
//        }while(decrement<5);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println("Volvo");

        for(int i=2;i<cars.length;i++){
            System.out.println(cars[i]);
        }
//        for (String i : cars) {
//            System.out.println(i);
//        }
    }
}
