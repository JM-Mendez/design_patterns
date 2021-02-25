from abc import ABC, abstractmethod

class FileSystemVisitor():

    @abstractmethod
    def visit_file(self, file):
        pass

    @abstractmethod
    def visit_directory(self, directory):
        pass


