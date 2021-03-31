package BuilderComplete;

public class App {


    public static void main(String[] args) {
        Roof roof = new Roof("Shingles");
        Foundation foundation = new Foundation("Concrete");

        Wall[] walls = {
            new Wall("Wood", true, true),
            new Wall("Wood", true, true),
            new Wall("Wood", true, true),
            new Wall("Glass", false, true),
            new Wall("Drywall", false, false),
        };

        Floor[] floors = {
            new Floor("Wood"),
            new Floor("Concrete"),
        };

        House house = new House(roof,foundation,walls,floors);

        System.out.println("Here's your house:");
        System.out.println(house);
    }
}
