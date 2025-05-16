public class Reptile extends Animal {

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

    @Override
    public String makeSound(){
        return "Woop";
    }

    @Override
    public String move(){
        return "Swimming";
    }

    public String eat(){
        return "Eats something";
    }
}
