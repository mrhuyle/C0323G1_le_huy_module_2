package ss7_abstract_interface.practice.animal_and_edible;

public class Apple extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Apple could be sliced";
    }
}
