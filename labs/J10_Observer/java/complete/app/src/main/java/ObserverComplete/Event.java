package ObserverComplete;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Event  {
  private final List<Consumer<String>> observers = new ArrayList<Consumer<String>>();

  public void register(Consumer<String> o) {
    this.observers.add(o);
  }

  public void unregister(Consumer<String> o) {
    this.observers.remove(o);
  }

  public void notifyObservers(String value) {
    for(Consumer<String> o : this.observers){
      o.accept(value);
    }
  };

}
