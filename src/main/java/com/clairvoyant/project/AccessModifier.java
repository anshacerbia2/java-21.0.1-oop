package com.clairvoyant.project;

public class AccessModifier {
  public static void main(String[] args) {
    // Class Access Modifiers
    // Private-Package
    PrivatePackage a = new PrivatePackage();
    PrivatePackageChild a2 = new PrivatePackageChild();
    PrivatePackageGrandChild a3 = new PrivatePackageGrandChild();

    // Public
    Public b = new Public();
    PublicChild b2 = new PublicChild();
    PublicGrandChild b3 = new PublicGrandChild();

    // Attributes, Methods and Constructors Access Modifiers
    // Private-Package
    System.out.println(a.fname); // Returns "Ansha"
    System.out.println(b.fname); // Returns "Ansha"
    System.out.println(a.age);
    a.test(); // Returns "On private-package class, private-package method"
    b.test(); // Returns "On public class, private-package method"

    // Public
    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(b.lname); // Returns "Cerbia"
    a.test2(); // Returns "On private-package class, public method"
    b.test2(); // Returns "On public class, public method"

    // Protected
    System.out.println(a.age); // Returns 17
    System.out.println(a2.age); // Returns 17
    System.out.println(a3.age); // Returns 17
    System.out.println(b.age); // Returns 17
    System.out.println(b2.age); // Returns 17
    System.out.println(b3.age); // Returns 17
    a.test(); // Returns "On private-package class, private-package method"
    b.test(); // Returns "On public class, private-package method"

    // Private

  }
}
