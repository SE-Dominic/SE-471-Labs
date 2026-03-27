public class MediaAttachment extends Attachment {
    private int length_Second;

    public MediaAttachment(int uniqueID, String author, int length_Second) {
        super(uniqueID, author);
        this.length_Second = length_Second;
    }

    public int getLengthSecond() {
        return length_Second;
    }

    @Override
    public void preview() {
        System.out.println("Previewing media attachment: " + toString());
    }

    @Override
    public String toString() {
        return "MediaAttachment[id=" + getUniqueID() + ", author=" + getAuthor() + ", length=" + length_Second + "s]";
    }
}
