from position import Position, Status
from typing import List
from datetime import datetime


class ComplexPosition(Position):
    positions:List[Position]


    def getInfo(self) -> str:
        results = '{Complex \n'
        for p in self.positions:
            results += '   '
            results += p.getInfo() + '\n'
        results += '}'
        return results


    def __init__(self, positions:List[Position]):
        self.positions=positions
        self.opened_on=datetime.utcnow()
        self.status=Status.Open