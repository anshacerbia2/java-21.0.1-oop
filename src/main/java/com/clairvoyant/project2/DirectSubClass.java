package com.clairvoyant.project2;

public class DirectSubClass extends Public {
  DirectSubClass() {
    super();
  }

  public DirectSubClass(String a) {
    super("a");
  }

  protected DirectSubClass(String a, String b) {
    this("a", "b", "c"); // Private Constructor only invokable within the class itself
  }

  private DirectSubClass(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: Public(String a, String b, String c) in com.clairvoyant.project2 has
     *                                 private access
     */
  }

  public static void main(String[] args) {
    /*
     * Condition: Instance of class in the same package
     * Constructor:
     * - Private-Package is invokable in the same package
     * - Protected always invokable
     * - Private always not invokable from another class
     * Attribute/Method:
     * - Private-Package is accessible in the same package as long as none of its ancestors come from different package,
     *   even if its superclass root or direct parent are in the same package.
     * - Protected always accessible
     * - Private always not accessible from another class
     */
    var a = new Public();
    /*
     * Constructor bellow are invokable:
     * new Public();
     * new Public("a");
     * new Public("a", "b");
     */
    System.out.println(a.fname); // Returns "Ansha"
    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17

    var b = new DirectSubClass();
    System.out.println(b.fname); // Returns "Ansha"
    System.out.println(b.lname); // Returns "Cerbia"
    System.out.println(b.age); // Returns 17

    var c = new IndirectSubClass();
    System.out.println(c.fname); // Returns "Ansha"
    System.out.println(c.lname); // Returns "Cerbia"
    System.out.println(c.age); // Returns 17

    var d = new AnotherIndirectSubClass1();
    System.out.println(d.fname); // Returns "Ansha"
    System.out.println(d.lname); // Returns "Cerbia"
    System.out.println(d.age); // Returns 17

    var e = new AnotherIndirectSubClass2();
    System.out.println(e.fname); // Returns "Ansha"
    System.out.println(e.lname); // Returns "Cerbia"
    System.out.println(e.age); // Returns 17

    var f = new AnotherIndirectSubClass3();
    /*
     * System.out.println(f.fname); -> Error: "fname" is not public in 'com.clairvoyant.project2.Public'. Cannot be
     *                                         accessed from outside package. Because class AnotherIndirectSubClass3
     *                                         already inherits fname from direct/indirect parent in different package
     */
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17

    var g = new AnotherIndirectSubClass4();
    /*
     * System.out.println(f.fname); -> Error: 'fname' is not public in 'com.clairvoyant.project2.Public'. Cannot be
     *                                         accessed from outside package
     */
    System.out.println(g.lname); // Returns "Cerbia"
    System.out.println(g.age); // Returns 17

    /*
     * Condition: Instance of class in different package
     * - Private always not accessible
     * - Protected always accessible. Even if the parent of the instance
     * - Accessing private-package attribute/method from instance of a class from different package are not allowed.
     *   Even if the class of the instance has been extended to the superclass in this package.
     */
    var h = new com.clairvoyant.project3.DirectSubClass();
    System.out.println(h.fname); // Returns "Ansha"
    System.out.println(h.lname); // Returns "Cerbia"
    System.out.println(h.age); // Returns 17

    var i = new com.clairvoyant.project3.IndirectSubClass();
    System.out.println(i.fname); // Returns "Ansha"
    System.out.println(i.lname); // Returns "Cerbia"
    System.out.println(i.age); // Returns 17

    var j = new com.clairvoyant.project3.AnotherIndirectSubClass1();
    System.out.println(j.fname); // Returns "Ansha"
    System.out.println(j.lname); // Returns "Cerbia"
    System.out.println(j.age); // Returns 17

    var k = new com.clairvoyant.project3.AnotherIndirectSubClass2();
    System.out.println(k.fname); // Returns "Ansha"
    System.out.println(k.lname); // Returns "Cerbia"
    System.out.println(k.age); // Returns 17

    var l = new com.clairvoyant.project3.AnotherIndirectSubClass3();
    System.out.println(l.fname); // Returns "Ansha"
    System.out.println(l.lname); // Returns "Cerbia"
    System.out.println(l.age); // Returns 17

    var m = new com.clairvoyant.project3.AnotherIndirectSubClass4();
    System.out.println(m.fname); // Returns "Ansha"
    System.out.println(m.lname); // Returns "Cerbia"
    System.out.println(m.age); // Returns 17
  }
}
