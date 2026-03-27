public class Main {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);

        // 1. create Notifications and add them to nc
        nc.addItem("Meeting at 10am");
        nc.addItem("New comment on your post");
        nc.addItem("Server backup completed");
        nc.addItem("Password expires in 3 days");
        nc.addItem("Download finished: report.pdf");
        nc.addItem("Friend request from Alice");
        nc.addItem("System update available");
        nc.addItem("Low disk space warning");
        nc.addItem("New login from Chrome on Mac");
        nc.addItem("Weekly summary ready");

        // 2. create attachments and link them to notifications in nc
        MediaAttachment media1 = new MediaAttachment(1, "Alice", 120);
        FileAttachment file1 = new FileAttachment(2, "Bob", 2048);

        // Link 1st, 2nd, and 3rd Notification objects to the same MediaAttachment
        nc.setAttachment(media1, 0);
        nc.setAttachment(media1, 1);
        nc.setAttachment(media1, 2);

        // Link 5th and 9th Notification objects to the same FileAttachment
        nc.setAttachment(file1, 4);
        nc.setAttachment(file1, 8);

        nb.printNotifications();

        // Demonstrate shared attachments (Flyweight)
        System.out.println("\n--- Verifying shared attachments (Flyweight) ---");
        System.out.println("Notification 1 attachment: " + nc.getItem(0).getAttachment());
        System.out.println("Notification 2 attachment: " + nc.getItem(1).getAttachment());
        System.out.println("Notification 3 attachment: " + nc.getItem(2).getAttachment());
        System.out.println("Same object? " + (nc.getItem(0).getAttachment() == nc.getItem(1).getAttachment()));

        System.out.println("Notification 5 attachment: " + nc.getItem(4).getAttachment());
        System.out.println("Notification 9 attachment: " + nc.getItem(8).getAttachment());
        System.out.println("Same object? " + (nc.getItem(4).getAttachment() == nc.getItem(8).getAttachment()));
    }
}
