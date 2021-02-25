package A00_FizzBuzz.java.complete;

public class App {

  private static String toMessage(int i){
    final boolean divides3 = i%3==0;
    final boolean divides5 = i%5==0;

    if( divides3 && divides5){
      return "FizzBuzz";
    }

    if( divides3 ){
      return "Fizz";
    }

    if( divides5 ){
      return "Buzz";
    }

    return String.valueOf(i);
  }

  public static void main(String[] args){
    for(int i = 1; i<=100;i++){
      System.out.println(toMessage(i));
    }
    System.out.println("\n\nDone!");
  }
}
