package com.clairvoyant.project;

public class Cast {
  public static void main(String[] args) {
    // Primitive Casting
    // Widening Casting (Automatic Casting):
    int myInt = 9;
    double myDouble = myInt; // Automatic cast
    System.out.println(myDouble); // Output: 9.0

    // Narrowing Casting (Manual Casting):
    double myDouble2 = 9.78;
    int myInt2 = (int) myDouble; // Manual cast dari double ke int
    System.out.println(myInt2); // Output: 9

    /*
     * Object Casting (Affects only attribute access, not the actual values or methods)
     * - Only instance of subclass can be cast
     * - The method always be subclass method
     * - Upcasting the subclass attributes refer to superclass
     * - Upcasting the subclass attributes refer to subclass
     */
    Animal animal = new Animal();
    System.out.println(animal.age); // Returns 1
    animal.makeSound(); // Returns "Animal sound"

    Dog dog = new Dog();
    System.out.println(dog.age); // Returns 2
    dog.makeSound(); // Returns "Bark"

    // Upcasting
    // E.g. 1
    Animal animal2 = new Dog();
    System.out.println(animal2.age); // Returns 1
    animal2.makeSound(); // Returns "Bark"

    // E.g. 2
    Animal animal3 = dog;
    System.out.println(animal3.age); // Returns 1
    animal3.makeSound(); // Returns "Bark"

    // Downcasting
    /*
     * Will returns error:
     * Dog dog2 = new Animal();
     * Dog dog2 = animal;
     * Dog dog2 = (Animal) animal;
     * Dog dog2 = (Dog) animal; -> Error: ClassCastException (animal is not instance of Dog)
     * Dog dog2 = animal2;
     * Dog dog2 = (Animal) animal2;
     */

    // E.g.
    Dog dog2 = (Dog) animal2;
    System.out.println(dog2.age); // Returns 2
    dog2.makeSound(); // Returns "Bark"
  }
}

class Animal {
  int age = 1;

  void makeSound() {
    System.out.println("Animal sound");
  }
}

class Dog extends Animal {
  int age = 2;

  void makeSound() {
    System.out.println("Bark");
  }
}
