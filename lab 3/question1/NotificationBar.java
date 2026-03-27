public class NotificationBar {
    private NotificationCollectionIF notifications;

    public NotificationBar(NotificationCollectionIF nc) {
        this.notifications = nc;
    }

    public void printNotifications() {
        NotificationIteratorIF iterator = notifications.createIterator();
        while (iterator.hasNext()) {
            Notification n = iterator.next();
            System.out.println(n.getContent());
        }
    }
}
