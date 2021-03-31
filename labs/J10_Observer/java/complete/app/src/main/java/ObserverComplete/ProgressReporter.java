package ObserverComplete;

public class ProgressReporter {

  public void update(String message){
    System.out.println("[[Progress update: " + message + "]]");
  }

}
