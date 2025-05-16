public class Mammal extends Animal{

    private int legs;

    Mammal(String name, int age, int legs) {
        super(name, age);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String makeSound() {
        return "Raaaarrr";
    }

    @Override
    public String move(){
        return "Moves";
    }

    public String eat(){
        return "Eats meat";
    }
}
