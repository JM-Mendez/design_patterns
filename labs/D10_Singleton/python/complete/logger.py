import time

class Logger():
    __instance = None

    @staticmethod
    def getInstance():
        if Logger.__instance is None:
            Logger.__instance = Logger()
        return Logger.__instance

    def __init__(self):
        if Logger.__instance is not None:
            raise Exception("Singleton only!")
        #Pretend like this is an expensive operation
        time.sleep(3)

    def info(self, message:str):
        print('[info:' + message + ']')

    def warn(self, message:str):
        print('[warn:' + message + ']')

    def error(self, message:str):
        print('[error:' + message + ']')


