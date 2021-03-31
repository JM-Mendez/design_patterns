package StateComplete;

public abstract class OrderStatus {
  public abstract OrderStatus next(OrderStatus newStatus) throws Exception ;

  public static final OrderStatus created = new Created();
  public static final OrderStatus shipped = new Shipped();
  public static final OrderStatus filled = new Filled();
  public static final OrderStatus billed = new Billed();
}

class Created extends OrderStatus{
  
  @Override
  public String toString(){
    return "Created";
  }

  @Override
  public OrderStatus next(OrderStatus newStatus) throws Exception{
    if(newStatus != OrderStatus.filled){
      throw new Exception("Bogus transition");
    }
    return newStatus;
  }
}

class Filled extends OrderStatus{
  
  @Override
  public String toString(){
    return "Filled";
  }

  @Override
  public OrderStatus next(OrderStatus newStatus) throws Exception {
    if(newStatus != OrderStatus.shipped){
      throw new Exception("Bogus transition");
    }
    return newStatus;
  }
}


class Shipped extends OrderStatus{
  
  @Override
  public String toString(){
    return "Shipped";
  }

  @Override
  public OrderStatus next(OrderStatus newStatus) throws Exception {
    if(newStatus != OrderStatus.billed){
      throw new Exception("Bogus transition");
    }
    return newStatus;
  }
}

class Billed extends OrderStatus{
  
  @Override
  public String toString(){
    return "Billed";
  }

  @Override
  public OrderStatus next(OrderStatus newStatus) throws Exception {
    throw new Exception("Bogus transition");
  }
}