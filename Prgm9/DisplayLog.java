import java.util.*;
public class DisplayLog implements Command
{
    private RemoteControl remoteControl;
    
    public DisplayLog(RemoteControl r){
        remoteControl = r;
    }
    
    public void execute() {
        ArrayList<Command> commandLog = remoteControl.getCommandLog();
        System.out.println("\nCommand Log");
        for (Command command : commandLog) {
            System.out.println(command.display());
        }
    }
    
    public void undo() { }
}

