import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Smk {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        CommandExecutor commandExecutor = new CommandExecutor();
        SquareContainer squareContainer = new SquareContainer();
        boolean quit = false;
        while(!quit){
            String commandString = scanner.nextLine();
            ArrayList<String> commandParts = new ArrayList<>(Arrays.asList(commandString.split(" ")));
            String command = commandParts.remove(0);
            switch (command){
                case "P":
                    squareContainer.print();
                    break;
                case "C":
                    commandExecutor.executeCommand(new Create(), commandParts);
                    break;
                case "M":
                    commandExecutor.executeCommand(new Move(),commandParts);
                    break;
                case "S":
                    commandExecutor.executeCommand(new Scale(),commandParts);
                    break;
                case "R":
                    squareContainer.redo();
                    break;
                case "U":
                    squareContainer.undo();
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }
}
