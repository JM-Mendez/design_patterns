from filesystemvisitor import FileSystemVisitor

class DirectoryPrinter(FileSystemVisitor):
    nesting = 0

    def pad(self,toPad):
        padded = toPad
        for i in range(0,self.nesting):
            padded = ' ' + padded
        return padded

    def visit_file(self, file):
        print(self.pad(file.name))

    def visit_directory(self, directory):
        print(self.pad(directory.name))
        self.nesting= self.nesting+1
        for c in directory.getContents():
            c.accept(self)
        self.nesting = self.nesting-1

