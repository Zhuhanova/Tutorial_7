public class Snake extends Reptile{

    Snake(String name, int age, String color){
        super(name, age, color);
    }

    @Override
    public String makeSound(){
        return "Woop";
    }

    @Override
    public String move(){
        return "Swimming";
    }

    @Override
    public String eat(){
        return "Eats something";
    }
}
