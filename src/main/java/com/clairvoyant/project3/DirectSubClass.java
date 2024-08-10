package com.clairvoyant.project3;

import com.clairvoyant.project2.Public;

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
     * Static Attribute/Method (via instance),
     * Static Attribute/Method (via class, e.g. Public.a):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     */

    /*
     * Condition Belows (a, b, c, d, e, f, g): Different package from this class
     *
     * Constructor:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     *                      - Except f and g, since this class is either class of the instance or class ancestor of
     *                        f and g
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    Public.b(); // Returns "On public class, public static method"
    Public.c(); // Returns "On public class, protected static method"

    var a = new Public("");
    System.out.println(a.lname); // Returns "Cerbia"
    a.b(); // Returns "On public class, public static method"
    a.c(); // Returns "On public class, protected static method"

    var b = new com.clairvoyant.project2.DirectSubClass("");
    System.out.println(b.lname); // Returns "Cerbia"
    b.b(); // Returns "On public class, public static method"
    b.c(); // Returns "On public class, protected static method"

    var c = new com.clairvoyant.project2.IndirectSubClass("");
    System.out.println(c.lname); // Returns "Cerbia"
    c.b(); // Returns "On public class, public static method"
    c.c(); // Returns "On public class, protected static method"

    var d = new com.clairvoyant.project2.AnotherIndirectSubClass1("");
    System.out.println(d.lname); // Returns "Cerbia"
    d.b(); // Returns "On public class, public static method"
    d.c(); // Returns "On public class, protected static method"

    var e = new com.clairvoyant.project2.AnotherIndirectSubClass2("");
    System.out.println(e.lname); // Returns "Cerbia"
    e.b(); // Returns "On public class, public static method"
    e.c(); // Returns "On public class, protected static method"

    var f = new com.clairvoyant.project2.AnotherIndirectSubClass3("");
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17
    f.b(); // Returns "On public class, public static method"
    f.c(); // Returns "On public class, protected static method"

    var g = new com.clairvoyant.project2.AnotherIndirectSubClass4("");
    System.out.println(g.lname); // Returns "Cerbia"
    System.out.println(g.age); // Returns 17

    /*
     * Condition Belows (h, i, j, k, l, m): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except h)
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     *                      - Except h, i, j, and k, since this class is either class of the instance or class ancestor
     *                        of h, i, j, and k
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
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
//    Public.a();
//    Public.b();
//    Public.c();
//    Public.d();
//    m.a();
//    m.b();
//    m.c();
//    m.d();
  }
}
