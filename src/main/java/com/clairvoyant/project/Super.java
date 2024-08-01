package com.clairvoyant.project;

public class Super {
  public static void main(String[] args) {
    var child1 = new Child1();
    System.out.println(child1.name); // Returns "Default"

    var child2 = new Child2("Ansha");
    System.out.println(child2.name); // Returns "Cerbia"
    child2.sayHello(); // Return "Hello Cerbia"
    child2.getParentName(); // Return "Ansha"
    child2.sayHelloParent(); // Return "Hello Ansha"

    var child3 = new Child3("Ansha");
    System.out.println(child3.name); // Returns null as default value of String

  }
}

class Parent1 {
  String name;

  Parent1() {
    this.name = "Default";
  }
}

class Child1 extends Parent1 {
}

class Parent2 {
  String name;

  Parent2() {
    this.name = "Default";
  }

  Parent2(String name) {
    this.name = name;
  }

  void sayHello() {
    System.out.println("Hello " + name);
  }
}

class Child2 extends Parent2 {
  String name;

  Child2(String name) {
    /*
     *  If the parent has constructor with params, then the existence keyword "super" in children is a must.
     *  Calling super is means calling parent constructor, so it's also depend on which one of the constructor
     *  do you want to call if the constructor is overloading.
     */
    super(name);
    this.name = "Cerbia";
  }


  void sayHello() {
    System.out.println("Hello " + this.name);
  }

  void getParentName() {
    System.out.println(super.name); // Accessing parrent attribute
  }

  void sayHelloParent() {
    super.sayHello();
  }
}

class Parent3 {
  String name;
}

class Child3 extends Parent3 {
  String name;

  Child3(String name) {
    /*
     * If the parent class does not define any constructors, the Java compiler provides a default no-argument
     * constructor. In this case, calling super() in the child class constructor will call this default no-argument
     * constructor, which has no effect beyond satisfying the requirement to call a parent constructor.
     */
    super();
  }
}

