package BuilderStartingpoint;

import java.util.Arrays;

public class House {
    private Roof roof;
    private Foundation foundation;
    private Wall[] walls;
    private Floor[] floors;

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



    public House(Roof roof, Foundation foundation, Wall[] walls, Floor[] floors) {
        this.roof = roof;
        this.foundation = foundation;
        this.walls = walls;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House \n[floors=" + Arrays.toString(floors) + ", \nfoundation=" + foundation + ", \nroof=" + roof + ", \nwalls="
                + Arrays.toString(walls) + "\n]";
    }

  
}
