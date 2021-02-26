package CompositeStartingPoint;

public class App {
    
    public static void main(String[] args) {
        Position[] positions = {
            Position.Open("EUR",2300, Direction.Long),
            Position.Open("YEN",83300, Direction.Short),
        };
        
        System.out.println("Here are my positions:");
        for(Position p : positions){
            System.out.println(p);
        }

    }
}
