package iteratorcomplete;


public class App {

    public static void main(String[] args) {
      IIterator<Integer> iterator = new FibsIterator();

      int total = 0;
      while(iterator.getItem() <= 4000000){
        if(iterator.getItem()%2==0){
          total+= iterator.getItem();
        }
          iterator.next();
      }

      System.out.println("Solution: ");
      System.out.println(total);
    }
}
