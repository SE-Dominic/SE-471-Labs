import java.util.ArrayList;

public class NotificationCollection implements NotificationCollectionIF {
    private ArrayList<Notification> items;

    public NotificationCollection() {
        items = new ArrayList<>();
    }

    public Notification getItem(int index) {
        return items.get(index);
    }

    public void addItem(String str) {
        items.add(new Notification(str));
    }

    public int getLength() {
        return items.size();
    }

    public void setAttachment(Attachment a, int index) {
        items.get(index).setAttachment(a);
    }

    @Override
    public NotificationIteratorIF createIterator() {
        return new NotificationIterator(this);
    }
}
