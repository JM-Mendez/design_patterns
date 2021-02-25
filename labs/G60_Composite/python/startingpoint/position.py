from datetime import datetime
from enum import Enum


class Direction(Enum):
    Long = 0
    Short = 1


class Status(Enum):
    Open = 0
    Closed = 1


Symbol = str


class Position:
    symbol: Symbol
    quantity: int
    opened_on: datetime
    closed_on: datetime
    direction: Direction
    status: Status

    def getInfo(self) -> str:
        return '[' + self.symbol + ' ' + str(self.quantity) + ' ' + self.direction.name + ']'

    def __init__(self, symbol: Symbol, quantity: int, direction: Direction=Direction.Long):
        self.symbol=symbol
        self.quantity=quantity
        self.direction=direction
        self.opened_on=datetime.utcnow()
        self.status=Status.Open