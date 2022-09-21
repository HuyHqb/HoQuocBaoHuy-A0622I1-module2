package ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface;

import ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface.animal.Animal;
import ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface.animal.Chicken;
import ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface.animal.Tiger;
import ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface.edible.Edible;
import ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface.fruit.Apple;
import ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface.fruit.Fruit;
import ss7_abstract_class_and_interface.thuc_hanh.class_animal_and_interface.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            } else {
                Edible edibler = (Tiger) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
