class HomeAnimalDemo {

    public static void main(String[] args) {


        Dog dog = new Dog("Rex");
        HomeAnimal<Dog> homeDog = new HomeAnimal<>(dog);

        homeDog.showType();
        homeDog.sleepOnTheCouch();
        homeDog.getAnimals().run();
        homeDog.getAnimals().speak();
        homeDog.performBeneficialAction();


        Cat cat = new Cat("Whiskers");
        HomeAnimal<Cat> homeCat = new HomeAnimal<>(cat);

        homeCat.showType();
        homeCat.sleepOnTheCouch();
        homeCat.getAnimal().run();
        homeCat.getAnimal().speak();
        homeCat.performBeneficialAction();
    }
}