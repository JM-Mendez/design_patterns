from floor import Floor
from foundation import Foundation
from roof import Roof
from wall import Wall
from house import House
from typing import List


class HouseBuilder():
    foundation: Foundation = None
    floors: List[Floor] = []
    walls: List[Wall] = []
    roof: Roof = None

    def __init__(self):
        pass

    def is_buildable(self)->bool:
        return (self.foundation is not None) and \
               len(self.walls) > 3 and \
               self.roof is not None and \
               len(self.floors) > 0


    def to_house(self)->House:
        return House(self.foundation,self.floors,self.walls,self.roof)

    def withInteriorWalls(self, quantity:int):
        for i in range(0, quantity):
            newWall = Wall('Drywall', False, False)
            self.walls.append(newWall)
        return self

    def withExteriorWalls(self, material:str, quantity:int = 4):
        for i in range(0, quantity):
            newWall = Wall(material, True, True)
            self.walls.append(newWall)
        return self

    def withWoodFloor(self):
        self.floors = [
            Floor('Wood')
        ]
        return self

    def withConcreteFoundation(self):
        self.foundation=Foundation('Concrete')
        return self

    def withRegularRoof(self):
        self.roof = Roof('Shingles')
        return self

