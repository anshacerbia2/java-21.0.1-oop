package com.clairvoyant.project2;


/*
 * SUMMARIZE
 *
 * Class with access modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 *
 * Constructor with access modifier:
 * 1. Private-Package accessible by:
 *    - Any classes in same package with the class of the constructor
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible in:
 *    - Any classes in same package with the class of the constructor
 * 4. Private only accessible from within the class of the constructor
 * Note: Constructor are not inherited
 *
 * Non-Static Attribute/Method of an instance with access modifier:
 * 1. Private-Package accessible by:
 *    - Any classes in same package with the class of the instance
 *      Important: If the instance class extend any classes outside the package, the accessed instance attribute/method
 *                 should be inherited from the instance class itself or from the closest ancestor of the instance class
 *                 that still in the same package before it extends any ancestor from outside the package. E.g:
 *                 Package 1:
 *                 class a
 *                 class b extend a
 *                 class d extend c
 *                 Package 2:
 *                 class c extend a
 *                 Explanation:
 *                 - Accessing attribute/method of instance c/d within class b are not allowed even if the accessed
 *                   attribute/method inherited from class a, which is still in the same package with b
 *                 - Accessing attribute/method of instance d within class b will be allowed if d redefines
 *                   (hiding/overriding) the same attribute/method within itself
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible by:
 *    - Any classes (in same package with the class that inherits the accessed instance attribute/method)
 *    - Any Subclasses (in different package from the class that inherits the accessed instance attribute/method). They
 *      can only access their own and their ascendant attribute/method as well as their descendants
 * 4. Private accessible:
 *    - With setter and getter (by any classes in any package)
 *    - Without setter and getter (within the class of the instance, the accessed attribute/method should be defined
 *      on it, not inherited from another class)
 *
 * Attribute/Method with non-access modifier:
 * 1. Final   : Cannot be overridden/modified
 * 2. Static  : Belongs to the class, rather than an instance
 *
 * Static Attribute/Method (via class/instance reference) with access modifier:
 * 1. Private-Package accessible by:
 *    - Any classes in same package with the reference (class/class of the instance)
 *      Important: If the reference extend any classes outside the package, the accessed reference attribute/method
 *                 should be inherited from the reference itself or from the closest ancestor of the reference that still
 *                 in the same package before it extends any ancestor from outside the package. E.g:
 *                 Package 1:
 *                 class a
 *                 class b extend a
 *                 class d extend c
 *                 Package 2:
 *                 class c extend a
 *                 Explanation:
 *                 - Accessing attribute/method of class/instance c/d within class b are not allowed even if the accessed
 *                   attribute/method are inherited from class a, which is still in the same package with b
 *                 - Accessing attribute/method of class/instance d within class b will be allowed if d redefines
 *                   (hiding/overriding) the same attribute/method within itself
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible by:
 *    - Any classes (in same package with the class that inherits the accessed reference attribute/method)
 *    - Any subclasses of the class that inherits the accessed reference attribute/method in any package (subclasses can
 *      access each other, as long as they are under the same superclass that inherits the attribute/method to them)
 * 4. Private accessible:
 *    - With setter and getter (by any classes in any package)
 *    - Without setter and getter (within the class of the instance, the accessed attribute/method should be defined
 *      on it, not inherited from another class)
 *
 * Explanation:
 * Static Attributes (Class Variables): Static attributes are shared among all instances of a class. They are stored at
 *                                      the class level, meaning there is only one copy of the attribute regardless of
 *                                      how many instances of the class exist.
 * Instance Attributes                : Instance attributes are unique to each instance of the class. Each instance has
 *                                      its own copy of these attributes.
 * When you change the value of a static attribute, that change is reflected across all instances of the class.
 *
 * The class bellow accessed by class AccessModifier on package com.clairvoyant.project2 and AccessModifier2 on package
 * com.clairvoyant.project3
 */
