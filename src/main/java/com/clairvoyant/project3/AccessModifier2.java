package com.clairvoyant.project3;

import com.clairvoyant.project2.Public;
// import com.clairvoyant.project2.PrivatePackage; -> Error: Cannot be accessed from outside package

public class AccessModifier2 {
  public static void main(String[] args) {
    /*
     * Static Attribute/Method (via class, e.g. Public.a)
     * Static Attribute/Method (via instance):
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
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
     * - Private         -> Not Accessible
     *
     * Non-Static Attribute/Method:
     * - Private-Package -> Not Accessible
     * - Public          -> Accessible
     * - Protected       -> Not Accessible
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

    var l = new AnotherIndirectSubClass3();
    System.out.println(l.lname); // Returns "Cerbia"

    var m = new AnotherIndirectSubClass4();
    System.out.println(m.lname); // Returns "Cerbia"
   }
}