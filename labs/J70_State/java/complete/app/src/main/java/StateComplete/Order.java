package StateComplete;

public class Order {
	private int id;
	private int quantity;
	private String productNumber="";
	private OrderStatus status = OrderStatus.created;

    public int getID(){
        return this.id;
    }

    public void setID(int value){
        this.id=value;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int value){
        this.quantity = value;
    }

    public String getProductNumber(){
        return this.productNumber;
    }

    public void setProductNumber(String value){
        this.productNumber=value;
    }

    public OrderStatus getStatus(){
        return this.status;
    }

    public void setStatus(OrderStatus value) throws Exception{
        this.status=this.status.next(value);
    }

}
