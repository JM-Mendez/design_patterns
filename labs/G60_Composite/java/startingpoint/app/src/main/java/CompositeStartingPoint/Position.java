package CompositeStartingPoint;

import java.time.LocalDateTime;

public class Position {
    private LocalDateTime openedOn;
    private LocalDateTime closedOn;
    private Direction direction;
    private String symbol;
    private int quantity;

    public void close() throws Exception {
        if(this.closedOn!=null){
            throw new Exception("Already closed!");
        }

        this.closedOn=LocalDateTime.now();
    }

    public LocalDateTime getOpenedOn() {
        return openedOn;
    }

    public LocalDateTime getClosedOn() {
        return closedOn;
    }

    public Direction getDirection() {
        return direction;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public String toString() {
        return "Position [closedOn=" + closedOn + ", direction=" + direction + ", openedOn=" + openedOn + ", quantity="
                + quantity + ", symbol=" + symbol + "]";
    }

    public static Position Open(String symbol, int quantity,Direction direction) {
        Position p = new Position();

        p.direction = direction;        
        p.symbol = symbol;
        p.quantity = quantity;
        p.openedOn=LocalDateTime.now();

        return p;
    }


}
