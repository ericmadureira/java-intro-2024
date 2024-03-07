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

    public String greeting(){
        return "Fala, meu consagrado!";
    }

    void setFavouriteFood(String favouriteFood){
        this.favouriteFood = favouriteFood;
    }
}
