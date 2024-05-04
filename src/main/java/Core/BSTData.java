package Core;

/**
 *
 * @author zahid
 */
public class BSTData implements Comparable<BSTData> {

    private String word;
    private MyLinkedList<WordFrequency> wordCounts;

    public BSTData(String word) {
        this.word = word;
        this.wordCounts = new MyLinkedList<>();
        wordCounts.addLast(new WordFrequency(MainFrame.file.getName(), 1));
    }

    public void update() {
        boolean found = false;
        for (int i = 0; i < wordCounts.getSize(); i++) {
            WordFrequency freq = wordCounts.get(i);
            if (freq.getDocumentName().equals(MainFrame.file.getName())) {
                freq.setFrequency(freq.getFrequency() + 1);
                found = true;
                break;
            }
        }
        if (!found) {
            wordCounts.addLast(new WordFrequency(MainFrame.file.getName(), 1));
        }
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
        String output = word + " => ";
        for (int i = 0; i < wordCounts.getSize(); i++) {
            output += wordCounts.get(i).toString() + "-> ";
        }
        return output;
    }

}
