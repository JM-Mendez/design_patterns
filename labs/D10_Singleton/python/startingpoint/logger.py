import time

class Logger():

    def __init__(self):
        #Pretend like this is an expensive operation
        time.sleep(3)

    def info(self, message:str):
        print('[info:' + message + ']')

    def warn(self, message:str):
        print('[warn:' + message + ']')

    def error(self, message:str):
        print('[error:' + message + ']')


