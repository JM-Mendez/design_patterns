from floor import Floor
from foundation import Foundation
from roof import Roof
from wall import Wall
from typing import List

class House():
    def __init__(self, foundation: Foundation, floors: List[Floor], walls: List[Wall], roof: Roof):
        self.roof = roof
        self.walls = walls
        self.floors = floors
        self.foundation = foundation

    def print_summary(self):
        print('House Summary')
        print('Foundation: ' + self.foundation.material)
        print('Walls:')
        for wall in self.walls:
            print('  ' + wall.material)
        print('Floors:')
        for floor in self.floors:
            print('  ' + floor.material)
        print('Roof: ' + self.roof.material)



