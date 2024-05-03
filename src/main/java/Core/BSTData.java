package Core;

/**
 *
 * @author zahid
 */
public class BSTData implements Comparable<BSTData> {
    
    private String word;
    private MyLinkedList<WordFrequency> wordCounts;
    
    public BSTData(String word, String documentName) {
        this.word = word;
        this.wordCounts = new MyLinkedList<>();
        this.wordCounts.addLast(new WordFrequency(documentName, 1));
    }
    
    public String getWord() {
        return word;
    }
    
    public void setWord(String word) {
        this.word = word;
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
        return word;
    }
    
}
