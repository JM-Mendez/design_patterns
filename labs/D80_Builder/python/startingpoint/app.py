
from floor import Floor
from foundation import Foundation
from roof import Roof
from wall import Wall
from house import House



if __name__ == "__main__":
    floors = [
        Floor('Concrete'),
        Floor('Wood'),
    ]

    walls = [
        Wall('Drywall', False, False),
        Wall('Wood', True, True),
        Wall('Wood', True, True),
        Wall('Wood', True, True),
        Wall('Glass', False, True),
    ]

    roof = Roof('Shingles')
    foundation = Foundation('Concrete')

    house = House(foundation, floors, walls, roof)
    house.print_summary()



