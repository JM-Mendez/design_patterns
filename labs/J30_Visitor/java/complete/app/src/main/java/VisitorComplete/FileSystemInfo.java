package VisitorComplete;

public abstract class FileSystemInfo {
  private String name="";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileSystemInfo(String name) {
    this.name = name;
  }

  public abstract void accept(IFileSystemVisitor visitor);

}

