package thisIsJava.prob.probc06a;

public class StaticPrinter {
    static void staticPrintln(int age, boolean isLogout, double rating, String name) {
        System.out.println(age);
        System.out.println(isLogout);
        System.out.println(rating);
        System.out.println(name);
    }

    static void staticPrintln(int age) {
        System.out.println(age);
    }

    static void staticPrintln(boolean isLogout) {
        System.out.println(isLogout);
    }

    static void staticPrintln(double rating) {
        System.out.println(rating);
    }

    static void staticPrintln(String name) {
        System.out.println(name);
    }
}
