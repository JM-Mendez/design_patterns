package ObserverComplete;

public class Logger {

  public Logger() {

  }
  
  public void warn(String message) {
      System.out.println("[Warn] " + message);
  }

  public void info(String message) {
      System.out.println("[Info] " + message);
  }

  public void error(String message) {
      System.out.println("[Error] " + message);
  }

}
