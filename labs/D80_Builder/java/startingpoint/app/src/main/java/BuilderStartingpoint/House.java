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
        StringBuilder message = new StringBuilder();

        message.append("House [\n");

        message.append(this.roof);
        message.append("\n");

        message.append(this.foundation);
        message.append("\n");

        message.append("Floors: \n");
        for(Floor floor : this.floors){
            message.append("  + ");
            message.append(floor);
            message.append("\n");
        }

        message.append("Walls: \n");
        for(Wall wall : this.walls){
            message.append("  +");
            message.append(wall);
            message.append("\n");
        }

        message.append("]\n");
        return message.toString();
    }

  
}
