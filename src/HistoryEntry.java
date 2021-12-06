import java.util.TreeMap;

class HistoryEntry {
    public TreeMap<Integer, Square> squares;

    public HistoryEntry(TreeMap<Integer, Square> squares) {
        this.squares = squares;
    }
}