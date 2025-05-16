public class Penguin extends Bird {

    Penguin(String name, int age, int wings) {
        super(name, age, wings);
    }

    @Override
    public String makeSound() {
        return "Tweeting";
    }

    @Override
    public String move(){
        return "Flying";
    }

    @Override
    public String eat(){
        return "Eats worm";
    }
}
