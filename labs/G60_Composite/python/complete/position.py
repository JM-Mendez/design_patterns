from datetime import datetime
from enum import Enum

class Status(Enum):
    Open = 0
    Closed = 1

#Abstract base class.
class Position():
    opened_on: datetime
    closed_on: datetime
    status: Status

    def getInfo(self) -> str:
        pass
