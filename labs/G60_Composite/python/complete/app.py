from complex_position import ComplexPosition
from simple_position import SimplePosition, Direction


positions = [
   SimplePosition("EUR", 15, Direction.Long),
   SimplePosition("USD", 22, Direction.Short),
   ComplexPosition([
       SimplePosition("YEN", 15, Direction.Long),
       SimplePosition("SFR", 22, Direction.Short),
   ]),
]

print('Here are all my open positions.')
for p in positions:
    print(p.getInfo())