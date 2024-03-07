import java.util.ArrayList;

// Just one public class per file, and its name should be identical to filename.
public class Main {
    private int salary;
    protected int height;
    private void updateSalary(){
        this.salary = 3000;
    }
    public int getSalary(){
        return this.salary;
    }

    public static void main(String[] args) {
        // Global scope variables can be initialized with no value.
        int age;
        age = 32;

        // Local scope variables must be initialized.
        var fakeName = "Cire";

        // There are 8 primitive types:
        // 4 integers with different sizes...
        byte verySmall; // size = 8 bits
        short small; // size = 16 bits
        int regular; // size = 32 bits
        long large; // size = 64 bits
        // and 4 others you may recognize from other languages:
        boolean isBrazilian = true;
        char initial = 'E'; // Only takes a single character. In Java String comes from a class, not a primitive.
        String name = "Eric";
        float grade = 8.51F; // Holds decimals. Must add F to end of value.
        double cosmicTimer = 4.43454234324; // Holds even more decimals.

        // Conditionals
        if(age >= 18){
            System.out.print("Can drink beer!");
        } else {
            System.out.print("Sorry, you're under age.");
        }

        // Arrays
        // Uses {} instead of []
        char[] initials = {'E', 'M', 'G'}; // 1. Declare and set elements...
        int[] favoriteNumbers = new int[4]; // 2. or Declare with size.

        // ArrayList (dynamic array)
        ArrayList<String> myDogs = new ArrayList<String>();
        myDogs.add("Vicky Cristina Barcelona");
        myDogs.add("Salsicha");
        myDogs.add("Maní");
        myDogs.get(1); // Gets element at index 1.
        myDogs.size();

        // Loops
        for(var index = 0; index < 3; index++){
            System.out.println("I can see a dog...");
        }
        int pizzaSlices = 8;
        int pizzaIndex = 0;
        while(pizzaIndex < pizzaSlices){
            System.out.println("Just ate another delicious slice of pizza.");
            pizzaIndex++;
        }

        // Implicit casting
        int cloudsInSky = 36;
        double decimalClouds = cloudsInSky;

        // Explicit casting
        double decimalAge = 32.984579586;
        int roundedAge = (int) decimalAge;

        // Int to String
        String stringfiedAge = String.valueOf(age);
        // int StringToInt = Integer.parseInt(name);
    }
}