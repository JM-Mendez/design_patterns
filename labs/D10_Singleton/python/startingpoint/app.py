from logger import Logger

def enfarculate():
    try:
        value = 2/0
    except:
        #Better log this.
        logger = Logger()
        logger.error("Can't Divide by Zero!")

def denfarculate():
    try:
        value = 2/0
    except:
        #Better log this.
        logger = Logger()
        logger.error("Still can't Divide by Zero!")




print('Starting Enfarculation:')
enfarculate()

print('Starting Deenfarculation:')
denfarculate()
