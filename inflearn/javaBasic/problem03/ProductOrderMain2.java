package javaBasic.problem03;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 입력
        int value = inputOrderValue();

        // 생성
        ProductOrder[] orders = generateOrder(value);
        printOrders(orders);

        // 계산
        int totalAmount = getTotalAmount(orders); // option + command + v
        System.out.println(totalAmount);
    }

    static int inputOrderValue () {
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        return value;
    }

    static ProductOrder[] generateOrder (int value) {
        ProductOrder[] orders = new ProductOrder[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < value; i ++) {
            System.out.println((i + 1) + "번째 주문을 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.next();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }

        return orders;
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        javaBasic.problem03.ProductOrder productOrder = new javaBasic.problem03.ProductOrder();

        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;

        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }

        return totalAmount;
    }
}

