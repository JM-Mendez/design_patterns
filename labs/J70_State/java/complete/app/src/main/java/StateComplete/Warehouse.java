package StateComplete;

public class Warehouse {
    
    public static void Fill(Order o) throws Exception {
        o.setStatus(OrderStatus.filled);
    }

}
