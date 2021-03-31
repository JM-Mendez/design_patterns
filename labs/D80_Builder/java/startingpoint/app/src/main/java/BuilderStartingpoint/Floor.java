package BuilderStartingpoint;

public class Floor {
    private String material="";

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String value) {
        this.material=value;
    }

    public Floor(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Floor [material=" + material + "]";
    }

}
