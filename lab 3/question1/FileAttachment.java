public class FileAttachment extends Attachment {
    private int size_Byte;

    public FileAttachment(int uniqueID, String author, int size_Byte) {
        super(uniqueID, author);
        this.size_Byte = size_Byte;
    }

    public int getSizeByte() {
        return size_Byte;
    }

    @Override
    public void preview() {
        System.out.println("Previewing file attachment: " + toString());
    }

    @Override
    public String toString() {
        return "FileAttachment[id=" + getUniqueID() + ", author=" + getAuthor() + ", size=" + size_Byte + " bytes]";
    }
}
