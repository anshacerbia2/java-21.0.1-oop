package com.clairvoyant.project2;

public class AnotherIndirectSubClass4 extends com.clairvoyant.project3.IndirectSubClass {
  /*
   * Constructor:
   * - Private-package: Not Accessible -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  AnotherIndirectSubClass4() {
    /*
     * super(); -> Error: IndirectSubClass() is not public in com.clairvoyant.project3.IndirectSubClass. Cannot be accessed
     *                    from outside package.
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project3.DirectSubClass
     */
    super("a");
  }

  public AnotherIndirectSubClass4(String a) {
    super("a");
  }

  protected AnotherIndirectSubClass4(String a, String b) {
    this("a", "b", "c");
  }

  private AnotherIndirectSubClass4(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: DirectSubClass(String a, String b, String c) in com.clairvoyant.project.IndirectSubClass
     *                                 has private access
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project3.IndirectSubClass
     */
    super("a", "b");
  }

  public static void main(String[] args) {
    /*
     * Condition Belows (a, b, c, d, e, f, g): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except g)
     *
     * Non-Static Attribute/Method,
     * Static Attribute/Method (via instance):
     * - Private-Package -> Accessible
     *                      - Except for f and g, because one of their ancestor (direct parent) is from different package
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     *
     * Static Attribute/Method (via superclass. e.g. Public.a):
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     */
    var a = new Public();

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
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17

    var g = new AnotherIndirectSubClass4();
    System.out.println(g.lname); // Returns "Cerbia"
    System.out.println(g.age); // Returns 17

    /*
     * Condition Belows (h, i, j, k, l, m): Different package with this class
     *
     * Constructor:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     * - Private         -> Not Accessible
     *
     * Non-Static Attribute/Method,
     * Static Attribute/Method (via instance):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible
     */
    var h = new com.clairvoyant.project3.DirectSubClass("");
    System.out.println(h.lname); // Returns "Cerbia"
    System.out.println(h.age); // Returns 17

    var i = new com.clairvoyant.project3.IndirectSubClass("");
    System.out.println(i.lname); // Returns "Cerbia"
    System.out.println(i.age); // Returns 17

    var j = new com.clairvoyant.project3.AnotherIndirectSubClass1("");
    System.out.println(j.lname); // Returns "Cerbia"
    System.out.println(j.age); // Returns 17

    var k = new com.clairvoyant.project3.AnotherIndirectSubClass2("");
    System.out.println(k.lname); // Returns "Cerbia"
    System.out.println(k.age); // Returns 17

    var l = new com.clairvoyant.project3.AnotherIndirectSubClass3("");
    System.out.println(l.lname); // Returns "Cerbia"
    System.out.println(l.age); // Returns 17

    var m = new com.clairvoyant.project3.AnotherIndirectSubClass4("");
    System.out.println(m.lname); // Returns "Cerbia"
    System.out.println(m.age); // Returns 17
  }
}
