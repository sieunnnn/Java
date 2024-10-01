package thisIsJava.prob.probc06a;

public class Printer {
    void println(int age, boolean isLogout, double rating, String name) {
        System.out.println(age);
        System.out.println(isLogout);
        System.out.println(rating);
        System.out.println(name);
    }

    void println(int age) {
        System.out.println(age);
    }

    void println(boolean isLogout) {
        System.out.println(isLogout);
    }

    void println(double rating) {
        System.out.println(rating);
    }

    void println(String name) {
        System.out.println(name);
    }
}
