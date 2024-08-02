package com.clairvoyant.project2;

// import com.clairvoyant.project.PrivatePackage; -> Error: Cannot be accessed from outside package
import com.clairvoyant.project.Public;

/*
 * Summarize
 * Class with modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 * Constructor/Attribute/Method with modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 * 3. Protected only accessible from:
 *    - The class itself
 *    - Any subclass in the same package
 *    - An instance of subclass (in different package) that created within the subclass itself
 * 4. Private only accessible from the class itself
 */
public class AccessModifier2 {
  public static void main(String[] args) {
    Public a = new Public(); // Instance of class in different package

    System.out.println(a.lname); // Returns "Cerbia"
    /*
     * System.out.println(a.fname); -> Error: Private-package attribute cannot be accessed from outside package
     * System.out.println(a.age); -> Error: Protected attribute cannot be accessed from outside package
     * System.out.println(a.country); -> Error: Private attribute cannot be accessed from outside package
     */

    a.test2(); // Returns "On public class, public method"
    /*
     * a.test(); -> Error: Private-package method cannot be called from outside package
     * a.test3(); -> Error: Protected method cannot be called from outside package
     * a.test4(); -> Error: Private method cannot be called from outside its class
     */
  }
}

class PublicChild extends Public {
  public static void main(String[] args) {
    PublicChild a = new PublicChild(); // Instance of subclass Public

    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17
    /*
     * System.out.println(a.fname); -> Error: Private-package attribute cannot be accessed from outside package
     * System.out.println(a.country); -> Error: Private attribute cannot be accessed from outside package
     */

    a.test2(); // Returns "On public class, public method"
    a.test3(); // Returns "On public class, protected method"
    /*
     * b.test(); -> Error: Private-package method cannot be called from outside package
     * b.test4(); -> Error: Private method cannot be called from outside its class
     */
  }
}

class PublicGrandChild extends PublicChild {
  public static void main(String[] args) {
    PublicGrandChild a = new PublicGrandChild(); // Instance of subclass Public

    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17
    /*
     * System.out.println(a.fname); -> Error: Private-package attribute cannot be accessed from outside package
     * System.out.println(a.country); -> Error: Private attribute cannot be accessed from outside package
     */

    a.test2(); // Returns "On public class, public method"
    a.test3(); // Returns "On public class, protected method"
    /*
     * b.test(); -> Error: Private-package method cannot be called from outside package
     * b.test4(); -> Error: Private method cannot be called from outside its class
     */
  }
}