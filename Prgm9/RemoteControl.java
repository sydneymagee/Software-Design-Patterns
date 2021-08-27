import java.util.*;
// This is the Remote Control class.
// This is the invoker
//
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    int indexUndo;
    ArrayList<Command> commandLog;
 
    public RemoteControl() {
        onCommands = new Command[8];
        offCommands = new Command[8];
        indexUndo = 0;

        Command noCommand = new NoCommand();
        for (int i = 0; i < 8; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        commandLog = new ArrayList<Command>();
    }
  
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
 
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        indexUndo = commandLog.size();
        commandLog.add(onCommands[slot]);
    }
 
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        indexUndo = commandLog.size();
        commandLog.add(offCommands[slot]);
    }
    
    public void undoButtonWasPushed() {
        if(indexUndo == 0)
        {
            return;
        }
        else
        {
            commandLog.add(commandLog.get(indexUndo-1));
            indexUndo--;
        }
    }
  
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
    
    public ArrayList<Command> getCommandLog() {
        return commandLog;
    }
}

