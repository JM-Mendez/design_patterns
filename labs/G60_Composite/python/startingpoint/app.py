from position import Position, Direction

positions = [
   Position("EUR", 15, Direction.Long),
   Position("USD", 22, Direction.Short)
]

print('Here are all my open positions.')
for p in positions:
    print(p.getInfo())