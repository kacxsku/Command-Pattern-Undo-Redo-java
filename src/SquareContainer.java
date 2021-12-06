import java.util.EmptyStackException;

import java.util.TreeMap;

class SquareContainer extends History{

    public SquareContainer() {
        squaresRepository = new TreeMap<>();
    }

    public void undo() {
        try {
            HistoryEntry historyEntry = history.pop();
            TreeMap<Integer, Square> backup = copyState(squaresRepository);
            undoHistory.push(new HistoryEntry(backup));
            squaresRepository = historyEntry.squares;
        } catch (EmptyStackException e ) {
            return;
        }
    }

    public void redo() {
        try {
            HistoryEntry historyEntry = undoHistory.pop();
            TreeMap<Integer, Square> backup = copyState(squaresRepository);
            history.push(new HistoryEntry(backup));
            squaresRepository = historyEntry.squares;
        } catch (EmptyStackException e) {
            return;
        }
    }

    public void print() {
        squaresRepository.forEach((key, value) -> System.out.println(key + " " + value));
    }

}