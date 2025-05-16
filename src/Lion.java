public class Lion extends Mammal{

    Lion(String name, int age, int legs) {
        super(name, age, legs);
    }

    @Override
    public String makeSound() {
        return "Raaaarrr";
    }

    @Override
    public String move(){
        return "Moves";
    }

    @Override
    public String eat(){
        return "Eats meat";
    }
}
