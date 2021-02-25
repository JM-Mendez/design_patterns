class FileSystemInfo():
    name = ""

    def pad(self, toPad, nesting):
        padded = toPad
        for i in range(0,nesting):
            padded= ' ' + padded
        return padded

    def __init__(self, name):
        self.name = name

    def print(self,nesting=0):
        pass



class FileInfo(FileSystemInfo):
    def print(self, nesting=0):
        print(self.pad(self.name, nesting))


class DirectoryInfo(FileSystemInfo):
    contents = []

    def __init__(self, name):
        self.name = name
        self.contents=[]

    def getContents(self):
        return self.contents

    def addChild(self, child):
        self.contents.append(child)

    def print(self, nesting=0):
        print(self.pad(self.name, nesting))
        for c in self.contents:
            c.print(nesting+1)
