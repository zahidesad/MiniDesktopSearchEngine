package Core;

/**
 *
 * @author zahid
 */
public class BSTData implements Comparable<BSTData> {

    private String word;
    private MyLinkedList<WordFrequency> wordCounts;

    public BSTData(String word, String fileName) {
        this.word = word;
        this.wordCounts = new MyLinkedList<>();
        wordCounts.addLast(new WordFrequency(fileName, 1));
    }

    public void update() {
        String fileName = MainFrame.selectedFile.getName();
        boolean flag = false;
        for (WordFrequency freq : wordCounts) {
            if (freq.getDocumentName().equals(fileName)) {
                freq.incrementFrequency();
                flag = true;
                break;
            }
        }
        if (!flag) {
            wordCounts.addLast(new WordFrequency(fileName, 1));
        }
    }

    public String getWord() {
        return word;
    }

    public MyLinkedList<WordFrequency> getWordCounts() {
        return wordCounts;
    }

    @Override
    public int compareTo(BSTData other) {
        return this.word.compareTo(other.getWord());
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(word).append(" => ");
        for (WordFrequency freq : wordCounts) {
            output.append(freq).append(" -> ");
        }
        return output.toString();
    }

}
