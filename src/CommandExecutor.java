import java.util.ArrayList;

public class CommandExecutor extends History{

    public void executeCommand(Command command, ArrayList<String> commandList){
        saveBackup();
        command.execute(commandList);
    }
}
