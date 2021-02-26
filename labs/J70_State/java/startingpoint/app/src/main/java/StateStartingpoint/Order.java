package StateStartingpoint;

public class Order {
	private int id;
	private int quantity;
	private String productNumber="";
	private String status = "Created";

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

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String value){
        this.status=value;
    }

}
