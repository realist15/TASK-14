public class Dog extends Animal implements Run, Speak {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " is sleeping at home");
    }

    @Override
    public void speak() {
        System.out.println(name + " Barks!");
    }
}