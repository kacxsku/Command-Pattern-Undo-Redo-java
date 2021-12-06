import java.util.ArrayList;

public class Create implements Command{

    @Override
    public void execute(ArrayList<String> commandList) {
        int squareId = Integer.parseInt(String.valueOf(commandList.get(0)));
        int squareLength =  Integer.parseInt(String.valueOf(commandList.get(1)));
        SquareContainer.squaresRepository.put(squareId,new Square(squareLength));
    }
}
