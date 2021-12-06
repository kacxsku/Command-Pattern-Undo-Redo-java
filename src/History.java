
import java.util.AbstractMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class History {
    public static Stack<HistoryEntry> history = new Stack<>();
    public static Stack<HistoryEntry> undoHistory = new Stack<>();
    public static TreeMap<Integer, Square> squaresRepository;

    public TreeMap<Integer, Square> copyState(TreeMap<Integer, Square> state) {

        Map<Integer, Square> copiedState  = state
                .entrySet()
                .stream()
                .map(e -> new AbstractMap
                        .SimpleEntry<>(e.getKey(), new Square(e.getValue())))
                        .collect(Collectors.toMap(
                                AbstractMap.SimpleEntry::getKey,
                                AbstractMap.SimpleEntry::getValue));

        return new TreeMap<>(copiedState);
    }

    public void saveBackup() {
        TreeMap<Integer, Square> backup = copyState(squaresRepository);
        undoHistory = new Stack<>();
        history.push(new HistoryEntry(backup));
    }
}
