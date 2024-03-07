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

    public String greeting(){
        return null;
    }

    void createMain(){
        Main myCustomMain = new Main();
        // public method getSalary is visible from outside the original class.
        System.out.println(myCustomMain.getSalary());
    }
}
