
class Logger():
    def warn(self,message):
        print("[log:\033[93m{}\033[00m]".format(message))
    def info(self,message):
        print("[log:\033[92m{}\033[00m]".format(message))
    def error(self,message):
        print("[log:\033[91m{}\033[00m]".format(message))