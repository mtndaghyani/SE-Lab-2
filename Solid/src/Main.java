import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        processOrder();
    }

    public static void processOrder() {
        Scanner scanner = new Scanner(System.in);
        int customerAnswerForOrder = 0;
        System.out.println("Enter Customer Name : ");
        String customerName = scanner.nextLine();
        Order order = new Order(customerName);
        OrderService orderService = createOrderService(scanner);

        while (customerAnswerForOrder != 3) {
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if (customerAnswerForOrder == 1) {
                order.addItem(new Food("sandwich", 1000));
            } else if (customerAnswerForOrder == 2) {
                order.addItem(new Food("pizza", 2000));
            }
        }

        System.out.println("Pay Price:");
        if (orderService != null) {
            if (orderService instanceof OnlineOrderService) {
                ((OrderService) orderService).onlineOrderPayment(order.getTotalPrice());
            } else if (orderService instanceof OnSiteOrderService) {
                ((OrderService) orderService).onSiteOrderPayment(order.getTotalPrice());
            } else if (orderService instanceof PhoneOrderService) {
                ((OrderService) orderService).phoneOrderPayment(order.getTotalPrice());
            }
        }

        System.out.println(order);
    }

    public static OrderService createOrderService(Scanner scanner) {
        System.out.println("Enter Your Payment Method (1 for online, 2 for on-site, 3 for phone):");
        int customerAnswerForPaymentMethod = scanner.nextInt();
        OrderService orderService = null;

        if (customerAnswerForPaymentMethod == 1) {
            orderService = new OnlineOrderService();
            ((OrderService) orderService).onlineOrderRegister(customerName);
        } else if (customerAnswerForPaymentMethod == 2) {
            orderService = new OnSiteOrderService();
            ((OrderService) orderService).onSiteOrderRegister(customerName);
        } else if (customerAnswerForPaymentMethod == 3) {
            orderService = new PhoneOrderService();
            ((OrderService) orderService).phoneOrderRegister(customerName);
        }

        return orderService;
    }
}
