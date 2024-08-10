package com.clairvoyant.project3;

import com.clairvoyant.project2.DirectSubClass;
import com.clairvoyant.project2.Public;

public class AnotherIndirectSubClass3 extends DirectSubClass {
  /*
   * Constructor:
   * - Private-package: Not Accessible -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  AnotherIndirectSubClass3() {
    /*
     * super(); -> Error: DirectSubClass() is not public in com.clairvoyant.project2.DirectSubClass. Cannot be
     *                    accessed from outside package.
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.DirectSubClass
     */
    super("a", "b");
  }

  public AnotherIndirectSubClass3(String a) {
    super("a");
  }

  protected AnotherIndirectSubClass3(String a, String b) {
    this("a", "b", "c");
  }

  private AnotherIndirectSubClass3(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: DirectSubClass(String a, String b, String c) in com.clairvoyant.project2.DirectSubClass
     *                                 has private access
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.DirectSubClass
     */
    super("a", "b");
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
     * - Private         -> Not Accessible (Except l)
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
     *                      - Except l, since this class is either class of the instance or class ancestor l
     * - Private         -> Not Accessible
     *   Note: Accessible via getter
     */
    var h = new com.clairvoyant.project3.DirectSubClass();
    System.out.println(h.lname); // Returns "Cerbia"

    var i = new IndirectSubClass();
    System.out.println(i.lname); // Returns "Cerbia"

    var j = new AnotherIndirectSubClass1();
    System.out.println(j.lname); // Returns "Cerbia"

    var k = new AnotherIndirectSubClass2();
    System.out.println(k.lname); // Returns "Cerbia"

    var l = new AnotherIndirectSubClass3();
    System.out.println(l.lname); // Returns "Cerbia"
    System.out.println(l.age); // Returns 17

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
