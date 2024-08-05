package com.clairvoyant.project3;

import com.clairvoyant.project2.Public;

// Important: The context is that this class is in different package with superclass root (Public)
public class DirectSubClass extends Public {
  /*
   * Constructor:
   * - Private-package: Not Accessible -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  DirectSubClass() {
    /*
     * super(); -> Error: Public() is not public in com.clairvoyant.project2.Public. Cannot be accessed from outside
     *                    package.
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.Public
     */
    super("a");
  }

  public DirectSubClass(String a) {
    super("a");
  }

  protected DirectSubClass(String a, String b) {
    this("a", "b", "c");
  }

  private DirectSubClass(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: Public(String a, String b, String c) in com.clairvoyant.project2.Public has
     *                                 private access
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.Public
     */
    super("a", "b");
  }

  public static void main(String[] args) {
    /*
     * Condition Belows (a, b, c, d, e, f, g): Instances of classes in different package
     *
     * Superclass Root: Different package from this class
     *
     * Constructor:
     * - Private-Package -> Not Accessible (This class is in different package from all instances classes)
     * - Public          -> Accessible
     * - Protected       -> Not Accessible (This class is in different package from all instances classes)
     * - Private         -> Not Accessible
     *
     * Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     *                      - This class is neither a superclass of all instances classes (directly/indirectly) nor the
     *                        class of the instance itself, except for f and g
     * - Private         -> Not Accessible
     */
    var a = new Public("");
    System.out.println(a.lname); // Returns "Cerbia"

    var b = new com.clairvoyant.project2.DirectSubClass("");
    System.out.println(b.lname); // Returns "Cerbia"

    var c = new com.clairvoyant.project2.IndirectSubClass("");
    System.out.println(c.lname); // Returns "Cerbia"

    var d = new com.clairvoyant.project2.AnotherIndirectSubClass1("");
    System.out.println(d.lname); // Returns "Cerbia"

    var e = new com.clairvoyant.project2.AnotherIndirectSubClass2("");
    System.out.println(e.lname); // Returns "Cerbia"

    var f = new com.clairvoyant.project2.AnotherIndirectSubClass3("");
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17

    var g = new com.clairvoyant.project2.AnotherIndirectSubClass4("");
    System.out.println(g.lname); // Returns "Cerbia"
    System.out.println(g.age); // Returns 17

    /*
     * Condition Belows (h, i, j, k, l, m): Instances of classes in the same package
     *
     * Superclass Root: Different package from this class
     *
     * Constructor:
     * - Private-Package -> Accessible (This class is in the same package with all instances classes)
     * - Public          -> Accessible
     * - Protected       -> Accessible (This class is in the same package with all instances classes)
     * - Private         -> Not Accessible (Except for h, because h is created within its own class which is this class)
     *
     * Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     *                      - This class is either a superclass of all instances classes (directly/indirectly) or the
     *                        class of the instance itself, except for l and m
     * - Private         -> Not Accessible
     */
    var h = new DirectSubClass();
    System.out.println(h.lname); // Returns "Cerbia"
    System.out.println(h.age); // Returns 17

    var i = new IndirectSubClass();
    System.out.println(i.lname); // Returns "Cerbia"
    System.out.println(i.age); // Returns 17

    var j = new AnotherIndirectSubClass1();
    System.out.println(j.lname); // Returns "Cerbia"
    System.out.println(j.age); // Returns 17

    var k = new AnotherIndirectSubClass2();
    System.out.println(k.lname); // Returns "Cerbia"
    System.out.println(k.age); // Returns 17

    var l = new AnotherIndirectSubClass3();
    System.out.println(l.lname); // Returns "Cerbia"

    var m = new AnotherIndirectSubClass4();
    System.out.println(m.lname); // Returns "Cerbia"
  }
}
