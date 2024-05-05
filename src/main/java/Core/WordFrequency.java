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

    public void incrementFrequency() {
        frequency += 1;
    }

    public String getDocumentName() {
        return documentName;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return documentName + "," + frequency;
    }
}
