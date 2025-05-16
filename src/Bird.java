public abstract class Bird extends Animal{

    private int wings;

    Bird(String name, int age, int wings){
        super(name, age);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }
    public void setWings(int wings) {
        this.wings = wings;
    }

   public abstract String makeSound();

    public abstract String move();

    @Override
    public String naturalHabitat(){
        return "Bird";
    }

    public abstract String eat();
}
