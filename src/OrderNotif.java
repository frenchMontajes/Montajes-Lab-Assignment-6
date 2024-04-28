public interface OrderNotif {
    void generateInvoice(String fileName);

    void sendEmailNotification(String email);
}
