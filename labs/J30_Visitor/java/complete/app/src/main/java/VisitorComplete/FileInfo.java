package VisitorComplete;

public class FileInfo extends FileSystemInfo {

  public FileInfo(String name) {
    super(name);
  }

  @Override
  public void accept(IFileSystemVisitor visitor) {
    visitor.visit(this);
  }
}

