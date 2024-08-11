package com.clairvoyant.project2;

public class DirectSubClass extends Public {
  /*
   * Constructor:
   * - Private-package: Accessible     -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  DirectSubClass() {
    super();
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
     * Since the superclass parameterless constructor is accessible from here we do not need call super here
     */
  }

  public static void main(String[] args) {
    /*
     * For a, b, c, d, e, f, g, h, i, j, k, l, m:
     *
     * Static Attribute/Method (via class):
     * - Private-Package -> Accessible (Except f, g, h, i, j, k, l and m)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *
     * Static Attribute/Method (via instance):
     * - Private-Package -> Accessible (Except f, g, h, i, j, k, l and m)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     */

    /*
     * Each class of instances (a, b, c, d, e, f, g): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except b)
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Accessible (Except f and g)
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var a = new Public();
    // NON-STATIC
    // Attributes
    System.out.println(a.fname); // Returns "Ansha"
    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17
    // Methods
    a.test(); // Returns "On public class, private-package method"
    a.test2(); // Returns "On public class, public method"
    a.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(a.a); // Returns 1
    System.out.println(a.b); // Returns 2
    System.out.println(a.c); // Returns 3
    // Attributes via class
    System.out.println(Public.a); // Returns 1
    System.out.println(Public.b); // Returns 2
    System.out.println(Public.c); // Returns 3
    // Methods via instance
    a.a(); // Returns "On public class, private-package static method"
    a.b(); // Returns "On public class, public static method"
    a.c(); // Returns "On public class, protected static method"
    // Methods via class
    Public.a(); // Returns "On public class, private-package static method"
    Public.b(); // Returns "On public class, public static method"
    Public.c(); // Returns "On public class, protected static method"

    var b = new DirectSubClass();
    // NON-STATIC
    // Attributes
    System.out.println(b.fname); // Returns "Ansha"
    System.out.println(b.lname); // Returns "Cerbia"
    System.out.println(b.age); // Returns 17
    // Methods
    b.test(); // Returns "On public class, private-package method"
    b.test2(); // Returns "On public class, public method"
    b.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(b.a); // Returns 1
    System.out.println(b.b); // Returns 2
    System.out.println(b.c); // Returns 3
    // Attributes via class
    System.out.println(DirectSubClass.a); // Returns 1
    System.out.println(DirectSubClass.b); // Returns 2
    System.out.println(DirectSubClass.c); // Returns 3
    // Methods via instance
    b.a(); // Returns "On public class, private-package static method"
    b.b(); // Returns "On public class, public static method"
    b.c(); // Returns "On public class, protected static method"
    // Methods via class
    DirectSubClass.a(); // Returns "On public class, private-package static method"
    DirectSubClass.b(); // Returns "On public class, public static method"
    DirectSubClass.c(); // Returns "On public class, protected static method"

    var c = new IndirectSubClass();
    // NON-STATIC
    // Attributes
    System.out.println(c.fname); // Returns "Ansha"
    System.out.println(c.lname); // Returns "Cerbia"
    System.out.println(c.age); // Returns 17
    // Methods
    c.test(); // Returns "On public class, private-package method"
    c.test2(); // Returns "On public class, public method"
    c.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(c.a); // Returns 1
    System.out.println(c.b); // Returns 2
    System.out.println(c.c); // Returns 3
    // Attributes via class
    System.out.println(IndirectSubClass.a); // Returns 1
    System.out.println(IndirectSubClass.b); // Returns 2
    System.out.println(IndirectSubClass.c); // Returns 3
    // Methods via instance
    c.a(); // Returns "On public class, private-package static method"
    c.b(); // Returns "On public class, public static method"
    c.c(); // Returns "On public class, protected static method"
    // Methods via class
    IndirectSubClass.a(); // Returns "On public class, private-package static method"
    IndirectSubClass.b(); // Returns "On public class, public static method"
    IndirectSubClass.c(); // Returns "On public class, protected static method"

    var d = new AnotherIndirectSubClass1();
    // NON-STATIC
    // Attributes
    System.out.println(d.fname); // Returns "Ansha"
    System.out.println(d.lname); // Returns "Cerbia"
    System.out.println(d.age); // Returns 17
    // Methods
    d.test(); // Returns "On public class, private-package method"
    d.test2(); // Returns "On public class, public method"
    d.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(d.a); // Returns 1
    System.out.println(d.b); // Returns 2
    System.out.println(d.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass1.a); // Returns 1
    System.out.println(AnotherIndirectSubClass1.b); // Returns 2
    System.out.println(AnotherIndirectSubClass1.c); // Returns 3
    // Methods via instance
    d.a(); // Returns "On public class, private-package static method"
    d.b(); // Returns "On public class, public static method"
    d.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass1.a(); // Returns "On public class, private-package static method"
    AnotherIndirectSubClass1.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass1.c(); // Returns "On public class, protected static method"

    var e = new AnotherIndirectSubClass2();
    // NON-STATIC
    // Attributes
    System.out.println(e.fname); // Returns "Ansha"
    System.out.println(e.lname); // Returns "Cerbia"
    System.out.println(e.age); // Returns 17
    // Methods
    e.test(); // Returns "On public class, private-package method"
    e.test2(); // Returns "On public class, public method"
    e.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(e.a); // Returns 1
    System.out.println(e.b); // Returns 2
    System.out.println(e.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass2.a); // Returns 1
    System.out.println(AnotherIndirectSubClass2.b); // Returns 2
    System.out.println(AnotherIndirectSubClass2.c); // Returns 3
    // Methods via instance
    e.a(); // Returns "On public class, private-package static method"
    e.b(); // Returns "On public class, public static method"
    e.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass2.a(); // Returns "On public class, private-package static method"
    AnotherIndirectSubClass2.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass2.c(); // Returns "On public class, protected static method"

    var f = new AnotherIndirectSubClass3();
    // NON-STATIC
    // Attributes
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17
    // Methods
    f.test2(); // Returns "On public class, public method"
    f.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(f.b); // Returns 2
    System.out.println(f.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass3.b); // Returns 2
    System.out.println(AnotherIndirectSubClass3.c); // Returns 3
    // Methods via instance
    f.b(); // Returns "On public class, public static method"
    f.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass3.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass3.c(); // Returns "On public class, protected static method"

    var g = new AnotherIndirectSubClass4();
    // NON-STATIC
    // Attributes
    System.out.println(g.lname); // Returns "Cerbia"
    System.out.println(g.age); // Returns 17
    // Methods
    g.test2(); // Returns "On public class, public method"
    g.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(g.b); // Returns 2
    System.out.println(g.c); // Returns 3
    // Attributes via class
    System.out.println(AnotherIndirectSubClass4.b); // Returns 2
    System.out.println(AnotherIndirectSubClass4.c); // Returns 3
    // Methods via instance
    g.b(); // Returns "On public class, public static method"
    g.c(); // Returns "On public class, protected static method"
    // Methods via class
    AnotherIndirectSubClass4.b(); // Returns "On public class, public static method"
    AnotherIndirectSubClass4.c(); // Returns "On public class, protected static method"

    /*
     * Each class of instances (h, i, j, k, l, m): Different package with this class
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
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var h = new com.clairvoyant.project3.DirectSubClass("");
    // NON-STATIC
    // Attributes
    System.out.println(h.lname); // Returns "Cerbia"
    System.out.println(h.age); // Returns 17
    // Methods
    h.test2(); // Returns "On public class, public method"
    h.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(h.b); // Returns 2
    System.out.println(h.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.DirectSubClass.b); // Returns 2
    System.out.println(com.clairvoyant.project3.DirectSubClass.c); // Returns 3
    // Methods via instance
    h.b(); // Returns "On public class, public static method"
    h.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.DirectSubClass.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.DirectSubClass.c(); // Returns "On public class, protected static method"

    var i = new com.clairvoyant.project3.IndirectSubClass("");
    // NON-STATIC
    // Attributes
    System.out.println(i.lname); // Returns "Cerbia"
    System.out.println(i.age); // Returns 17
    // Methods
    i.test2(); // Returns "On public class, public method"
    i.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(i.b); // Returns 2
    System.out.println(i.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.IndirectSubClass.b); // Returns 2
    System.out.println(com.clairvoyant.project3.IndirectSubClass.c); // Returns 3
    // Methods via instance
    i.b(); // Returns "On public class, public static method"
    i.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.IndirectSubClass.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.IndirectSubClass.c(); // Returns "On public class, protected static method"

    var j = new com.clairvoyant.project3.AnotherIndirectSubClass1("");
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
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass1.b); // Returns 2
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass1.c); // Returns 3
    // Methods via instance
    j.b(); // Returns "On public class, public static method"
    j.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.AnotherIndirectSubClass1.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.AnotherIndirectSubClass1.c(); // Returns "On public class, protected static method"

    var k = new com.clairvoyant.project3.AnotherIndirectSubClass2("");
    // NON-STATIC
    // Attributes
    System.out.println(k.lname); // Returns "Cerbia"
    System.out.println(k.age); // Returns 17
    // Methods
    k.test2(); // Returns "On public class, public method"
    k.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(k.b); // Returns 2
    System.out.println(k.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass2.b); // Returns 2
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass2.c); // Returns 3
    // Methods via instance
    k.b(); // Returns "On public class, public static method"
    k.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.AnotherIndirectSubClass2.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.AnotherIndirectSubClass2.c(); // Returns "On public class, protected static method"

    var l = new com.clairvoyant.project3.AnotherIndirectSubClass3("");
    // NON-STATIC
    // Attributes
    System.out.println(l.lname); // Returns "Cerbia"
    System.out.println(l.age); // Returns 17
    // Methods
    l.test2(); // Returns "On public class, public method"
    l.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(l.b); // Returns 2
    System.out.println(l.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass3.b); // Returns 2
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass3.c); // Returns 3
    // Methods via instance
    l.b(); // Returns "On public class, public static method"
    l.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.AnotherIndirectSubClass3.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.AnotherIndirectSubClass3.c(); // Returns "On public class, protected static method"

    var m = new com.clairvoyant.project3.AnotherIndirectSubClass4("");
    // NON-STATIC
    // Attributes
    System.out.println(m.lname); // Returns "Cerbia"
    System.out.println(m.age); // Returns 17
    // Methods
    m.test2(); // Returns "On public class, public method"
    m.test3(); // Returns "On public class, protected method"

    // STATIC
    // Attributes via instance
    System.out.println(m.b); // Returns 2
    System.out.println(m.c); // Returns 3
    // Attributes via class
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass4.b); // Returns 2
    System.out.println(com.clairvoyant.project3.AnotherIndirectSubClass4.c); // Returns 3
    // Methods via instance
    m.b(); // Returns "On public class, public static method"
    m.c(); // Returns "On public class, protected static method"
    // Methods via class
    com.clairvoyant.project3.AnotherIndirectSubClass4.b(); // Returns "On public class, public static method"
    com.clairvoyant.project3.AnotherIndirectSubClass4.c(); // Returns "On public class, protected static method"
  }
}
