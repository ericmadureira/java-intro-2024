// Subclass
class Brazilian extends Person {
    String state;
    String favouriteFood;

    // Constructor
    public Brazilian(String name, int age, String state, String favouriteFood){
        // When extending a super class, you must call super() before declaring the attributes of subclass.
        super(name, age);
        this.state = state;
        this.favouriteFood = favouriteFood;
    }

    void setState(String state){
        this.state = state;
    }

    void setFavouriteFood(String favouriteFood){
        this.favouriteFood = favouriteFood;
    }
}

// class declaration is always lower case.
// Super class
public class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void createMain(){
        Main myCustomMain = new Main();
        // public method getSalary is visible from outside the original class.
        System.out.println(myCustomMain.getSalary());
    }
}
