package StateComplete;

public class BillingDepartment {
    
    public static void Bill(Order o) throws Exception {
        o.setStatus(OrderStatus.billed);
    }

}
