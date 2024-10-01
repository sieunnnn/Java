package thisIsJava.prob.probc06a;

public class MemberService {
    public boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        }
        return false;
    }

    public String logout(String id) {
        return id + "님이 로그아웃 되었습니다.";
    }
}
