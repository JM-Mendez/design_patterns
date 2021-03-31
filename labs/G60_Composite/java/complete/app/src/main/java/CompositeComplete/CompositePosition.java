package CompositeComplete;

public class CompositePosition extends Position{
    private final Position[] members;

    public CompositePosition(Position[] members) {
        this.members=members;
    }

    @Override
    public void close() throws Exception {
        super.close();
        for(Position m : this.members){
            m.close();
        }
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        for(Position m : this.members){
            message.append(" + ");
            message.append(m.toString());
            message.append("\n");
        }
        return message.toString();
    }

}
