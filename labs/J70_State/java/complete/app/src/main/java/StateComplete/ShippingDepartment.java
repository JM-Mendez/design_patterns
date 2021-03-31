package StateComplete;


public class ShippingDepartment {
    
    public static void Ship(Order o) throws Exception {
        o.setStatus(OrderStatus.shipped);
    }

}
