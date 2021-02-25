from order import Order
from orderstatus import OrderStatuses

class ShippingDepartment():

    @staticmethod
    def ship(order: Order) -> Order:
        order.status=order.status.next(OrderStatuses.shipped)
        return order

