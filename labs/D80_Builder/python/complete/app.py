from housebuilder import HouseBuilder


if __name__ == "__main__":
    builder = HouseBuilder() \
                .withConcreteFoundation() \
                .withRegularRoof() \
                .withWoodFloor() \
                .withInteriorWalls(3)

    if builder.is_buildable():
        print('ERROR! No Exterior walls yet')

    builder.withExteriorWalls('Wood')

    if not builder.is_buildable():
        print('ERROR! It should be buildable now!')

    house = builder.to_house()

    house.print_summary()



