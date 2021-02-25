from order import Order
from orderstatus import OrderStatuses

class BillingDepartment():

    @staticmethod
    def bill(order: Order) -> Order:
        order.status=order.status.next(OrderStatuses.billed)
        return order

