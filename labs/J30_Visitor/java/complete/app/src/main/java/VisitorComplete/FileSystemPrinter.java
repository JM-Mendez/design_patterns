package VisitorComplete;

public class FileSystemPrinter implements IFileSystemVisitor {
  private int nesting =1;

  private String pad(String toPad){
    return String.format("%1$" + this.nesting*3 + "s", toPad);
  }

  @Override
  public void visit(FileInfo target) {
    String name = pad(target.getName());
    System.out.println(name);
  }

  @Override
  public void visit(DirectoryInfo target) {
    String name = pad(target.getName());
    System.out.println(name);
    this.nesting+=1;

    for(FileSystemInfo child : target.getContents()){
      child.accept(this);
    }
    this.nesting-=1;
  }
  
}
