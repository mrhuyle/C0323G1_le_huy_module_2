package ss7_abstract_interface.practice.animal_and_edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println("Chicken " + edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                System.out.println(((Apple) fruit).howToEat());
            }
            if (fruit instanceof Orange) {
                System.out.println(((Orange) fruit).howToEat());
            }
        }
    }
}
