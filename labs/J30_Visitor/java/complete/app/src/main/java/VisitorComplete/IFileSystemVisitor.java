package VisitorComplete;

public interface IFileSystemVisitor {
  void visit(FileInfo target);
  void visit(DirectoryInfo target);
}
