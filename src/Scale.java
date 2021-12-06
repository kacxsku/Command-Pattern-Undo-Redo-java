import java.util.ArrayList;

public class Scale implements Command{

    @Override
    public void execute(ArrayList<String> commandList) {
        int squareId = Integer.parseInt(String.valueOf(commandList.get(0)));
        int squareScale = Integer.parseInt(String.valueOf(commandList.get(1)));

        Square squareToScale = SquareContainer.squaresRepository.get(squareId);

        squareToScale.setLength(squareToScale.getLength()*squareScale);
    }
}
