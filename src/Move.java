import java.util.ArrayList;

public class Move implements Command{

    @Override
    public void execute(ArrayList<String> commandList) {
        int squareId = Integer.parseInt(String.valueOf(commandList.get(0)));
        int squareXCoordinate = Integer.parseInt(String.valueOf(commandList.get(1)));
        int squareYCoordinate =  Integer.parseInt(String.valueOf(commandList.get(2)));

        Square squareToMove = SquareContainer.squaresRepository.get(squareId);

        squareToMove.setXCoordinate(squareToMove.getXCoordinate()+squareXCoordinate);
        squareToMove.setYCoordinate(squareToMove.getYCoordinate()+squareYCoordinate);

    }
}
