public class Notification {
    private String content;
    private Attachment attachment;

    public Notification(String content) {
        this.content = content;
        this.attachment = null;
    }

    public String getContent() {
        return content;
    }

    public void setAttachment(Attachment a) {
        this.attachment = a;
    }

    public Attachment getAttachment() {
        return attachment;
    }
}
