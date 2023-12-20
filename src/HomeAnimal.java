
public class HomeAnimal<T extends Animal & Run & Speak> {
    private T animal;


    public HomeAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void showType() {
        System.out.println("Type of animal: " + animal.getClass().getSimpleName());
    }

    public void performBeneficialAction() {
        System.out.println(animal.name + " is running in the park");
    }

    public void sleepOnTheCouch() {
    }

    public Run getAnimals() {

        return animal;
    }

}