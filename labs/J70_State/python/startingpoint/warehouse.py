from order import Order


class Warehouse():

    @staticmethod
    def fill(order: Order) -> Order:
        order.status="Filled"
        return order

