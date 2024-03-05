public class Main {
    public static void main(String[] args) {
        // Global scope variables can be initialized with no value.
        int age;
        int salary = 3000;
        age = 32;

        // Local scope variables must be initialized.
        var name = "Eric";

        // There are 8 primitive types:
        // 4 integers with different sizes...
        byte verySmall; // size = 8 bits
        short small; // size = 16 bits
        int regular; // size = 32 bits
        long large; // size = 64 bits
        // and 4 others you may recognize from other languages:
        boolean isBrazilian = true;
        char initial = 'E'; // Only takes a single character. In Java String comes from a class, not a primitive.
        float grade = 8.51F; // Holds decimals. Must add F to end of value.
        double cosmicTimer = 4.43454234324; // Holds even more decimals.

        // Conditionals
        if(age >= 18){
            System.out.print("Can drink beer!");
        } else {
            System.out.print("Sorry, you're under age.");
        }
    }
}