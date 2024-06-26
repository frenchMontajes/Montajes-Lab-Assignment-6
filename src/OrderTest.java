public class OrderTest {

    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        // These methods might not be needed for all orders
        OrderNotif notif = new OrderNotifAction();
        notif.generateInvoice("order_123.pdf");
        notif.sendEmailNotification("johndoe@example.com");
    }
}