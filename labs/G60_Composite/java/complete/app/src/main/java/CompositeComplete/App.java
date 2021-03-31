package CompositeComplete;

public class App {
    
    public static void main(String[] args) {
        Position[] positions = {
            SimplePosition.Open("EUR",2300, Direction.Long),
            SimplePosition.Open("YEN",83300, Direction.Short),
            new CompositePosition(new Position[]{
                SimplePosition.Open("SFR",200, Direction.Long),
                SimplePosition.Open("USD",8, Direction.Short),                
            })
        };
        
        System.out.println("Here are my positions:");
        for(Position p : positions){
            System.out.println(p);
        }

    }
}