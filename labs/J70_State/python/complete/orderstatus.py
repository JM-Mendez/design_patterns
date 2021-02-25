


class OrderStatus():
    def to_string(self) -> str:
        pass
    def next(self, nextStatus: object) -> object:
        pass


class OrderStatuses():
    created:OrderStatus
    filled:OrderStatus
    shipped:OrderStatus
    billed:OrderStatus



class CreatedStatus(OrderStatus):
    def to_string(self) -> str:
        return "Created"
    def next(self,nextStatus)->OrderStatus:
        if nextStatus != OrderStatuses.filled:
            raise Exception('Bogus State Transition!')
        return nextStatus

OrderStatuses.created = CreatedStatus()




class FilledStatus(OrderStatus):
    def to_string(self) -> str:
        return "Filled"
    def next(self,nextStatus)->OrderStatus:
        if nextStatus != OrderStatuses.shipped:
            raise Exception('Bogus State Transition!')
        return nextStatus

OrderStatuses.filled=FilledStatus()






class ShippedStatus(OrderStatus):
    def to_string(self) -> str:
        return "Shipped"
    def next(self,nextStatus)->OrderStatus:
        if nextStatus != OrderStatuses.billed:
            raise Exception('Bogus State Transition!')
        return nextStatus

OrderStatuses.shipped=ShippedStatus()




class BilledStatus(OrderStatus):
    def to_string(self) -> str:
        return "Billed"
    def next(self,nextStatus)->OrderStatus:
        raise Exception('Bogus State Transition!')

OrderStatuses.billed=BilledStatus()