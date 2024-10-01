package thisIsJava.prob.probc06a;

public class Main {
    public static void main(String[] args) {
        Member member = new Member("hong", "12345");
        MemberService memberService = new MemberService();

        boolean result = memberService.login(member.getId(), member.getPassword ());
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");

        } else {
            System.out.println("id 또는 password 가 올바르지 않습니다.");
        }

        System.out.println("===============");

        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");

        System.out.println("===============");

        StaticPrinter.staticPrintln(10);
        StaticPrinter.staticPrintln(true);
        StaticPrinter.staticPrintln(5.7);
        StaticPrinter.staticPrintln("홍길동");
    }
}
