// class declaration is always lower case.
public class Person {
    void createMain(){
        Main myCustomMain = new Main();
        // public method getSalary is visible from outside the original class.
        System.out.println(myCustomMain.getSalary());
    }
}
