package day09_Class;

/**
 * DOCUMENTATION: CLASS A (The Outer Class)
 * This acts as a container for the nested structure.
 * Even though it contains a static class, A itself cannot be static.
 */
class A {
    // Instance variable: Belongs to an object of A, not the class itself.
    int age;

    // Instance method: Requires an object of A to be called.
    public void show() {
        System.out.println("in show...");
    }

    /**
     * STATIC NESTED CLASS: B
     * The 'static' keyword here means B is associated with the class A,
     * rather than an instance of A.
     * * KEY RULES:
     * 1. It can be instantiated without an object of A.
     * 2. It cannot directly access non-static members of A (like 'age').
     */
    static class B {
        public void config() {
            System.out.println("in config...");
        }
    }
}

/**
 * MAIN CLASS: InnerClass
 * The entry point of the program.
 */
public class InnerClass {

    public static void main(String[] args) {
        // 1. Instantiating the Outer Class
        // We need 'obj' to call the instance method show().
        A obj = new A();
        obj.show();

        /*
         * 2. Instantiating the Static Nested Class
         * * INCORRECT SYNTAX (Commented out):
         * A.B obj1 = obj.new B();
         * Why? This syntax is ONLY for non-static inner classes because it
         * implies B needs the 'obj' instance to exist.
         * * CORRECT SYNTAX:
         * Since B is static, we treat it like a static member.
         * We access it via the Class Name (A) rather than the instance (obj).
         */
//        A.B obj1 = obj.new B();
        A.B obj1 = new A.B();
        obj1.config();

    }
}
