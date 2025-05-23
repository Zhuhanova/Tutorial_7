public abstract class Animal {

    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public abstract String makeSound();

    public abstract String move();

    public abstract String naturalHabitat();

    public void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
