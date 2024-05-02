package Core;

/**
 *
 * @author zahid
 */
public class BSTData {

    private String word;
    private MyLinkedList<WordFrequency> wordCounts;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public MyLinkedList<WordFrequency> getWordCounts() {
        return wordCounts;
    }
}
