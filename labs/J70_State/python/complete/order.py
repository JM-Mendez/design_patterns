from orderstatus import OrderStatuses,OrderStatus

class Order():
    status:OrderStatus = OrderStatuses.created
    id:int = -1
    productNumber:str=""
    quantity:int = 0
