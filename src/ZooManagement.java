//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZooManagement {
    public static void main(String[] args) {

        Mammal Lion = new Mammal("Tom", 5, 4);
        Bird Penguin = new Bird("Sara", 3, 2);
        Reptile Snake = new Reptile("Jane", 8, "Green");

        Animal[] animals = {Lion, Penguin, Snake};

        for (Animal a : animals) {
            a.displayInformation();
            System.out.println("It talks like " + a.makeSound()
                    + "\nAnd " + a.move());
        }

        System.out.println(Lion.eat());
        System.out.println(Penguin.eat());
        System.out.println(Snake.eat());
    }
}