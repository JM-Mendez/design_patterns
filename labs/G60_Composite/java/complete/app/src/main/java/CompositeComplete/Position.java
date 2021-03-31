package CompositeComplete;

import java.time.LocalDateTime;

public class Position {
    private LocalDateTime openedOn;
    private LocalDateTime closedOn;

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

    protected Position(){
        this.openedOn=LocalDateTime.now();
    }

}
