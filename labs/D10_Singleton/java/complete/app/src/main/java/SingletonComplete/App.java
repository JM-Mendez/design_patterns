package SingletonComplete;


public class App {
    
    public static int Enfarculate(){
        try{
            return 1/0; 
        }
        catch(Exception e){
            //Better log this.
            final Logger logger = new Logger();
            logger.error("Can't divide by zero.");
        }
        return 0;
    }

    public static int Disenfarculate(){
        try{
            return 1/0; 
        }
        catch(Exception e){
            //Better log this.
            final Logger logger = new Logger();
            logger.error("Still can't divide by zero.");
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println("\nCommencing Enfarculation");
        Enfarculate();

        System.out.println("\nCommencing Disenfarculation");
        Disenfarculate();

        System.out.println("\nOperation complete. Go away.");
    }
}
