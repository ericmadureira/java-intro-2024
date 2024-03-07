public class French extends Person {
    boolean likesCroissant;
    public French(String name, int age, boolean likesCroissant) {
        super(name, age);
        this.likesCroissant = likesCroissant;
    }

    @Override
    public String greeting(){
        return "Oui Oui!";
    }
}
