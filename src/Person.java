// Subclass
class Brazilian extends Person {
    String state;
    String favouriteFood;

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
    int age;
    String name;
    void createMain(){
        Main myCustomMain = new Main();
        // public method getSalary is visible from outside the original class.
        System.out.println(myCustomMain.getSalary());
    }
}
