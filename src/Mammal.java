public abstract class Mammal extends Animal {

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

    public abstract String makeSound();

    public abstract String move();

    @Override
    public String naturalHabitat(){
        return "Mammal";
    }

    public abstract String eat();
}
