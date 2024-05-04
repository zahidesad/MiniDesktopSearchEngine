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
        boolean flag = false;
        String fileName = MainFrame.selectedFile.getName();
        for (int i = 0; i < wordCounts.getSize(); i++) {
            WordFrequency freq = wordCounts.get(i);
            if (freq.getDocumentName().equals(fileName)) {
                freq.setFrequency(freq.getFrequency() + 1);
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
        StringBuilder output = new StringBuilder();
        output.append(word).append(" => ");
        for (int i = 0; i < wordCounts.getSize(); i++) {
            output.append(wordCounts.get(i)).append(" -> ");
        }
        return output.toString();
    }

}
