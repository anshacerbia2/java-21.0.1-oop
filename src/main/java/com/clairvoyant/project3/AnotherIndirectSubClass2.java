package com.clairvoyant.project3;

import com.clairvoyant.project2.Public;

public class AnotherIndirectSubClass2 extends IndirectSubClass {
  /*
   * Constructor:
   * - Private-package: Accessible     -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  AnotherIndirectSubClass2() {
    super();
  }

  public AnotherIndirectSubClass2(String a) {
    super("a");
  }

  protected AnotherIndirectSubClass2(String a, String b) {
    this("a", "b", "c");
  }

  private AnotherIndirectSubClass2(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: IndirectSubClass(String a, String b, String c) in com.clairvoyant.project3.IndirectSubClass
     *                                 has private access
     * Since the superclass parameterless constructor is accessible from here we do not need call super here
     */
  }

  public static void main(String[] args) {
    /*
     * Static Attribute/Method (via class, e.g. Public.a),
     * Static Attribute/Method (via instance):
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
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
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

    var g = new com.clairvoyant.project2.AnotherIndirectSubClass4("");
    System.out.println(g.lname); // Returns "Cerbia"

    /*
     * Condition Belows (h, i, j, k, l, m): Same package with this class
     *
     * Constructor:
     * - Private-Package -> Accessible
     * - Public          -> Accessible
     * - Protected       -> Accessible
     * - Private         -> Not Accessible (Except k)
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     *                      - Except k, since this class is either class of the instance or class ancestor k
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var h = new DirectSubClass();
    System.out.println(h.lname); // Returns "Cerbia"

    var i = new IndirectSubClass();
    System.out.println(i.lname); // Returns "Cerbia"

    var j = new AnotherIndirectSubClass1();
    System.out.println(j.lname); // Returns "Cerbia"

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
