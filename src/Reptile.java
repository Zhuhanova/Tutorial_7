public abstract class Reptile extends Animal {

    private String color;

    Reptile(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public abstract String makeSound();

    public abstract String move();

    @Override
    public String naturalHabitat(){
        return "Reptile";
    }

    public abstract String eat();
}
