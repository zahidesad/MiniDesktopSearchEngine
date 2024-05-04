package Core;

/**
 *
 * @author zahid
 */
public class WordFrequency {

    private String documentName;
    private int frequency;

    public WordFrequency(String documentName, int frequency) {
        this.documentName = documentName;
        this.frequency = frequency;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return documentName + "," + frequency;
    }
}
