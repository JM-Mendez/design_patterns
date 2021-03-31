package BuilderComplete;

public class Wall {
    private String material="";
    private boolean isLoadBearing=false;
    private boolean isExternal = false;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isLoadBearing() {
        return isLoadBearing;
    }

    public void setLoadBearing(boolean isLoadBearing) {
        this.isLoadBearing = isLoadBearing;
    }

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean isExternal) {
        this.isExternal = isExternal;
    }

    public Wall(String material, boolean isLoadBearing, boolean isExternal) {
        this.material = material;
        this.isLoadBearing = isLoadBearing;
        this.isExternal = isExternal;
    }

    @Override
    public String toString() {
        return "Wall [isExternal=" + isExternal + ", isLoadBearing=" + isLoadBearing + ", material=" + material + "]";
    }

}
