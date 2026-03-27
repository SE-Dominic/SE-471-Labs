public abstract class Attachment {
    private int uniqueID;
    private String author;

    public Attachment(int uniqueID, String author) {
        this.uniqueID = uniqueID;
        this.author = author;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void preview();
}
