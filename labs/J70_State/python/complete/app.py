from order import Order
from shippingdepartment import ShippingDepartment
from billingdepartment import BillingDepartment
from warehouse import Warehouse

def showStatus(order:Order):
    print('Your order is: ' + order.status.to_string())

if __name__ == "__main__":
    o = Order()
    o.id=1
    o.productNumber="512"
    o.quantity = 12

    showStatus(o)
    o = Warehouse.fill(o)
    showStatus(o)
    o = ShippingDepartment.ship(o)
    showStatus(o)
    o = BillingDepartment.bill(o)
    showStatus(o)