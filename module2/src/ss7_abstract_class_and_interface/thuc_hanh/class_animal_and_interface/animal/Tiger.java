package ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface.animal;

import ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: Roarrrrr";
    }

    @Override
    public String howToEat() {
        return "tiger eat chicken";
    }
}
