from order import Order


class BillingDepartment():

    @staticmethod
    def bill(order: Order) -> Order:
        order.status="Billed"
        return order

