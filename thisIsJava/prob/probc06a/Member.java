package thisIsJava.prob.probc06a;

public class Member {
    private String name;
    private String id;
    private String password;
    private int age;

    Member(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    Member(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
