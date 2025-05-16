public class Bird extends Animal {

    private int wings;

    Bird(String name, int age, int wings) {
        super(name, age);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }
    public void setWings(int wings) {
        this.wings = wings;
    }

    @Override
    public String makeSound() {
        return "Tweeting";
    }

    @Override
    public String move(){
        return "Flying";
    }

    public String eat(){
        return "Eats worm";
    }
}
