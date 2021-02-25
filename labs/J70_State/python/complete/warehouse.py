from order import Order
from orderstatus import OrderStatuses


class Warehouse():

    @staticmethod
    def fill(order: Order) -> Order:
        order.status=order.status.next(OrderStatuses.filled)
        return order

