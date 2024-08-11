package com.clairvoyant.project3;

public class AnotherIndirectSubClass1 extends DirectSubClass {
  /*
   * Constructor:
   * - Private-package: Accessible     -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  AnotherIndirectSubClass1() {
    super();
  }

  public AnotherIndirectSubClass1(String a) {
    super("a");
  }

  protected AnotherIndirectSubClass1(String a, String b) {
    this("a", "b", "c");
  }

  private AnotherIndirectSubClass1(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: DirectSubClass(String a, String b, String c) in com.clairvoyant.project3.DirectSubClass
     *                                 has private access
     * Since the superclass parameterless constructor is accessible from here we do not need call super here
     */
  }

  public static void main(String[] args) {
    /*
     * For a, b, c, d, e, f, g, h, i, j, k, l, m:
     *
     * Static Attribute/Method (via class):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *
     * Static Attribute/Method (via instance):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     */

    /*
     * Each class of instances (a, b, c, d, e, f, g): Different package with this class
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
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var a = new com.clairvoyant.project2.Public("");
    // NON-STATIC
    // Attributes
    System.out.println(a.lname); // Returns "Cerbia"
    // Methods
    a.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(a.b); // Returns 2
    System.out.println(a.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.Public.b); // Returns 2
    System.out.println(com.clairvoyant.project2.Public.c); // Returns 3
    // Methods via instance
    a.b(); // Returns "On public class, public static method"
    a.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project2.Public.b(); // Returns "On public class, public static method"
    com.clairvoyant.project2.Public.c(); // Returns "On public class, protected static method"

    var b = new com.clairvoyant.project2.DirectSubClass("");
    // NON-STATIC
    // Attributes
    System.out.println(b.lname); // Returns "Cerbia"
    // Methods
    b.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(b.b); // Returns 2
    System.out.println(b.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.DirectSubClass.b); // Returns 2
    System.out.println(com.clairvoyant.project2.DirectSubClass.c); // Returns 3
    // Methods via instance
    b.b(); // Returns "On public class, public static method"
    b.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project2.DirectSubClass.b(); // Returns "On public class, public static method"
    com.clairvoyant.project2.DirectSubClass.c(); // Returns "On public class, protected static method"

    var c = new com.clairvoyant.project2.IndirectSubClass("");
    // NON-STATIC
    // Attributes
    System.out.println(c.lname); // Returns "Cerbia"
    // Methods
    c.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(c.b); // Returns 2
    System.out.println(c.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.IndirectSubClass.b); // Returns 2
    System.out.println(com.clairvoyant.project2.IndirectSubClass.c); // Returns 3
    // Methods via instance
    c.b(); // Returns "On public class, public static method"
    c.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project2.IndirectSubClass.b(); // Returns "On public class, public static method"
    com.clairvoyant.project2.IndirectSubClass.c(); // Returns "On public class, protected static method"

    var d = new com.clairvoyant.project2.AnotherIndirectSubClass1("");
    // NON-STATIC
    // Attributes
    System.out.println(d.lname); // Returns "Cerbia"
    // Methods
    d.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(d.b); // Returns 2
    System.out.println(d.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass1.b); // Returns 2
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass1.c); // Returns 3
    // Methods via instance
    d.b(); // Returns "On public class, public static method"
    d.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project2.AnotherIndirectSubClass1.b(); // Returns "On public class, public static method"
    com.clairvoyant.project2.AnotherIndirectSubClass1.c(); // Returns "On public class, protected static method"

    var e = new com.clairvoyant.project2.AnotherIndirectSubClass2("");
    // NON-STATIC
    // Attributes
    System.out.println(e.lname); // Returns "Cerbia"
    // Methods
    e.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(e.b); // Returns 2
    System.out.println(e.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass2.b); // Returns 2
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass2.c); // Returns 3
    // Methods via instance
    e.b(); // Returns "On public class, public static method"
    e.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project2.AnotherIndirectSubClass2.b(); // Returns "On public class, public static method"
    com.clairvoyant.project2.AnotherIndirectSubClass2.c(); // Returns "On public class, protected static method"

    var f = new com.clairvoyant.project2.AnotherIndirectSubClass3("");
    // NON-STATIC
    // Attributes
    System.out.println(f.lname); // Returns "Cerbia"
    // Methods
    f.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(f.b); // Returns 2
    System.out.println(f.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass3.b); // Returns 2
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass3.c); // Returns 3
    // Methods via instance
    f.b(); // Returns "On public class, public static method"
    f.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project2.AnotherIndirectSubClass3.b(); // Returns "On public class, public static method"
    com.clairvoyant.project2.AnotherIndirectSubClass3.c(); // Returns "On public class, protected static method"

    var g = new com.clairvoyant.project2.AnotherIndirectSubClass4("");
    // NON-STATIC
    // Attributes
    System.out.println(g.lname); // Returns "Cerbia"
    // Methods
    g.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(g.b); // Returns 2
    System.out.println(g.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass4.b); // Returns 2
    System.out.println(com.clairvoyant.project2.AnotherIndirectSubClass4.c); // Returns 3
    // Methods via instance
    g.b(); // Returns "On public class, public static method"
    g.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project2.AnotherIndirectSubClass4.b(); // Returns "On public class, public static method"
    com.clairvoyant.project2.AnotherIndirectSubClass4.c(); // Returns "On public class, protected static method"

    /*
     * Each class of instances (h, i, j, k, l, m): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except j)
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible (Except j)
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var h = new DirectSubClass();
    // NON-STATIC
    // Attributes
    System.out.println(h.lname); // Returns "Cerbia"
    // Methods
    h.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(h.b); // Returns 2
    System.out.println(h.c); // Returns 3
    // Attributes via class
    System.out.println(DirectSubClass.b); // Returns 2
    System.out.println(DirectSubClass.c); // Returns 3
    // Methods via instance
    h.b(); // Returns "On public class, public static method"
    h.c(); // Returns "On public class, protected static method"
    // Methods via class
    DirectSubClass.b(); // Returns "On public class, public static method"
    DirectSubClass.c(); // Returns "On public class, protected static method"

    var i = new IndirectSubClass();
    // NON-STATIC
    // Attributes
    System.out.println(i.lname); // Returns "Cerbia"
    // Methods
    i.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(i.b); // Returns 2
    System.out.println(i.c); // Returns 3
    // Attributes via class
    System.out.println(IndirectSubClass.b); // Returns 2
    System.out.println(IndirectSubClass.c); // Returns 3
    // Methods via instance
    i.b(); // Returns "On public class, public static method"
    i.c(); // Returns "On public class, protected static method"
    // Methods via class
    IndirectSubClass.b(); // Returns "On public class, public static method"
    IndirectSubClass.c(); // Returns "On public class, protected static method"

    var j = new AnotherIndirectSubClass1();
    // NON-STATIC
    // Attributes
    System.out.println(j.lname); // Returns "Cerbia"
    System.out.println(j.age); // Returns 17
    // Methods
    j.test2(); // Returns "On public class, public method"
    j.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(j.b); // Returns 2
    System.out.println(j.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass1.b); // Returns 2
    System.out.println(AnotherIndirectSubClass1.c); // Returns 3
    // Methods via instance
    j.b(); // Returns "On public class, public static method"
    j.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass1.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass1.c(); // Returns "On public class, protected static method"

    var k = new AnotherIndirectSubClass2();
    // NON-STATIC
    // Attributes
    System.out.println(k.lname); // Returns "Cerbia"
    // Methods
    k.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(k.b); // Returns 2
    System.out.println(k.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass2.b); // Returns 2
    System.out.println(AnotherIndirectSubClass2.c); // Returns 3
    // Methods via instance
    k.b(); // Returns "On public class, public static method"
    k.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass2.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass2.c(); // Returns "On public class, protected static method"

    var l = new AnotherIndirectSubClass3();
    // NON-STATIC
    // Attributes
    System.out.println(l.lname); // Returns "Cerbia"
    // Methods
    l.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(l.b); // Returns 2
    System.out.println(l.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass3.b); // Returns 2
    System.out.println(AnotherIndirectSubClass3.c); // Returns 3
    // Methods via instance
    l.b(); // Returns "On public class, public static method"
    l.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass3.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass3.c(); // Returns "On public class, protected static method"

    var m = new AnotherIndirectSubClass4();
    // NON-STATIC
    // Attributes
    System.out.println(m.lname); // Returns "Cerbia"
    // Methods
    m.test2(); // Returns "On public class, public method"

    // STATIC
    // Attributes via instance
    System.out.println(m.b); // Returns 2
    System.out.println(m.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass4.b); // Returns 2
    System.out.println(AnotherIndirectSubClass4.c); // Returns 3
    // Methods via instance
    m.b(); // Returns "On public class, public static method"
    m.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass4.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass4.c(); // Returns "On public class, protected static method"
  }
}

