package BuilderComplete;

public class Roof {
    private String material="";

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String value) {
        this.material=value;
    }

    public Roof(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Roof [material=" + material + "]";
    }

}
