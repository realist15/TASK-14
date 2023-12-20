public class Cat extends Animal implements Run, Speak {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " hates water");
    }

    @Override
    public void speak() {
        System.out.println(name + " Meows!");
    }
}