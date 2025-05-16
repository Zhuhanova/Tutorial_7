//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZooManagement {
    public static void main(String[] args) {

        Lion lion = new Lion("Tom", 5, 4);
        Penguin penguin = new Penguin("Sara", 3, 2);
        Snake snake = new Snake("Jane", 8, "Green");

        Animal[] animals = {lion, penguin, snake};

        for (Animal a : animals) {
            a.displayInformation();
            System.out.println("It talks like " + a.makeSound()
                    + "\nAnd " + a.move()
                    + "\nAlso this is a " + a.naturalHabitat());
        }

        System.out.println(lion.eat());
        System.out.println(penguin.eat());
        System.out.println(snake.eat());
    }
}