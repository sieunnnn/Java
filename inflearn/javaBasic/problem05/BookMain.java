package javaBasic.problem05;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("Hello Java", "Seo", 0);
        Book book2 = new Book("JPA 프로그래밍", "kim", 700);

        book.displyInfo();
        book1.displyInfo();
        book2.displyInfo();
    }
}
