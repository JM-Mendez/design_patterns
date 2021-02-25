from order import Order


class ShippingDepartment():

    @staticmethod
    def ship(order: Order) -> Order:
        order.status="Shipped"
        return order

