package CompositeComplete;

public class SimplePosition extends Position{
    private Direction direction;
    private String symbol;
    private int quantity;

    public Direction getDirection() {
        return direction;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public static SimplePosition Open(String symbol, int quantity,Direction direction) {
        SimplePosition p = new SimplePosition();

        p.direction = direction;        
        p.symbol = symbol;
        p.quantity = quantity;
    
        return p;
    }

    @Override
    public String toString() {
        return "Position [closedOn=" + this.getClosedOn() + ", direction=" + direction + ", openedOn=" + this.getOpenedOn() + ", quantity="
                + quantity + ", symbol=" + symbol + "]";
    }

}
