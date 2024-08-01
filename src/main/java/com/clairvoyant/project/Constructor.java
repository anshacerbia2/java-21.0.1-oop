package com.clairvoyant.project;

public class Constructor {
  String name;
  int age;

  /*
   * Constructor:
   * - Constructor is a special method that is used to initialize objects.
   * - Constructor name must match the class name, and it cannot have a return type
   * - All classes have constructors by default
   * - Cannot have return type and return value
   */

  /*
   * Steps of instance creation:
   * 1. Memory Allocation  : When you use the new keyword, memory is allocated for the new object.
   * 2. Constructor Call   : The constructor is then called to initialize the newly allocated object.
   *                         This includes setting initial values to the instance variables.
   *                         Called before the object is fully created and before any methods of that class
   *                         (other than the constructor itself) can be called on the object.
   * 3. Instance Creation  : After the constructor completes its execution, the instance is fully created and
   *                         a reference to it is returned.
   */
  Constructor(String name, int age) {
    this.name = name; // This refers to the instance that will be created by this class
    this.age = age;
  }

  Constructor(String name) {
    // Calling another constructor, it will match constructor with the same type and length
    this(name, 18);
  }

  public static void main(String[] args) {
    Constructor instance = new Constructor("Ansha", 17); // Calling constructor 1
    Constructor instance2 = new Constructor("Ansha"); // Calling constructor 2

    System.out.println(instance.name); // Returns "Ansha"
    System.out.println(instance.age); // Returns 17
    System.out.println(instance2.name); // Returns "Ansha"
    System.out.println(instance2.age); // Returns 18
  }
}
