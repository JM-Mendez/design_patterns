package BuilderComplete;

public class App {


    public static void main(String[] args) throws Exception {
        HouseBuilder builder = new HouseBuilder()
                                .withConcreteFoundation()
                                .withRegularRoof()
                                .withWoodFloor();

        if(builder.isBuildable()){
            System.out.println("Something's Fishy! The house shouldn't be buildable without walls.");
        }

        builder.withExteriorWalls(4);
        builder.withInteriorWalls(3);

        if(!builder.isBuildable()){
            System.out.println("Something's Fishy! The house should build now.");
        }


        System.out.println("Here's your house:");
        System.out.println(builder.toHouse());
    }
}
