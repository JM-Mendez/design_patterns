package BuilderComplete;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
  private List<Wall> walls = new ArrayList<Wall>();
  private List<Floor> floors = new ArrayList<Floor>();
  private Roof roof;
  private Foundation foundation;
  
  public boolean isBuildable(){
    if(roof==null){
      return false;
    }

    if(foundation==null){
      return false;
    }

    return walls.size()>3 && floors.size()>0;
  }

  public HouseBuilder withInteriorWalls(int quantity){
    for(int i=0;i<quantity;i++){
      this.walls.add(new Wall("Drywall",false,false));
    }
    return this;
  }

  public HouseBuilder withExteriorWalls(int quantity, String material){
    for(int i=0;i<quantity;i++){
      this.walls.add(new Wall(material,true,true));
    }
    return this;
  }

  public HouseBuilder withExteriorWalls(int quantity){
    return this.withExteriorWalls(quantity,"Wood");
  }


  public HouseBuilder withWoodFloor(){
    floors.add(new Floor("Wood"));
    return this;
  }
  
  public HouseBuilder withConcreteFoundation(){
    foundation = new Foundation("Concrete");
    return this;
  }
  
  public HouseBuilder withRegularRoof(){
    roof = new Roof("Shingles");
    return this;
  }


  public House toHouse() throws Exception{
    if(!this.isBuildable()){
      throw new Exception("Bogus state!");
    }
    return new House(roof, foundation, walls.toArray(new Wall[0]), floors.toArray(new Floor[0]));
  }

}
