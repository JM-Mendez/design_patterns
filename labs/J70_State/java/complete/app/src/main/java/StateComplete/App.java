package StateComplete;

public class App {

    public static void ReportStatus(Order o)
    {
        System.out.println("The status is: " + o.getStatus());
    }
    
    public static void main(String[] args) throws Exception {
        Order o = new Order();
        o.setID(1);
    
        ReportStatus(o);
        Warehouse.Fill(o);
    
        ReportStatus(o);
        ShippingDepartment.Ship(o);
    
        ReportStatus(o);
        BillingDepartment.Bill(o);
    
        ReportStatus(o);
    }

}
