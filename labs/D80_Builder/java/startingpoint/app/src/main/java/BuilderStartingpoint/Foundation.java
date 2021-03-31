package BuilderStartingpoint;

public class Foundation {
    private String material="";

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String value) {
        this.material=value;
    }

    public Foundation(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Foundation [material=" + material + "]";
    }

}
