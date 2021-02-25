class FileSystemInfo():
    name = ""

    def __init__(self, name):
        self.name = name


class FileInfo(FileSystemInfo):
    def accept(self, visitor):
        visitor.visit_file(self)


class DirectoryInfo(FileSystemInfo):
    contents = []

    def __init__(self, name):
        self.name = name
        self.contents=[]

    def getContents(self):
        return self.contents

    def addChild(self, child):
        self.contents.append(child)

    def accept(self, visitor):
        visitor.visit_directory(self)
