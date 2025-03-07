public class OrderProcessor {
    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(abstractBook book, String userEmail) {
        System.out.println("Processing order for " + book.title);
        notificationService.sendNotification(userEmail, "Your order for " + book.title + " has been processed.");
    }
}
