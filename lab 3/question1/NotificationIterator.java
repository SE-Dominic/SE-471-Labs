public class NotificationIterator implements NotificationIteratorIF {
    private NotificationCollection collection;
    private int currentIndex;

    public NotificationIterator(NotificationCollection collection) {
        this.collection = collection;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.getLength();
    }

    @Override
    public Notification next() {
        Notification n = collection.getItem(currentIndex);
        currentIndex++;
        return n;
    }
}
