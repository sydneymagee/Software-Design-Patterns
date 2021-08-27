public interface Command {
	public void execute();
    public void undo();
    default public String display(){
        return this.getClass().getName();
    }
}
