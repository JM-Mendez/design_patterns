package BuilderStartingpoint;

import java.util.ArrayList;

public class House {
    private Roof roof;
    private Foundation foundation;
    private ArrayList<Wall> walls;
    private ArrayList<Floor> floors;

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public Iterable<Wall> getWalls() {
        return walls;
    }

    public Iterable<Floor> getFloors() {
        return floors;
    }

}
