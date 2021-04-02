package VisitorComplete;

public class FileSystemPrinter implements IFileSystemVisitor {
  private int nesting =0;

  private String pad(String toPad){
    String result = toPad;

    for(int i=0;i<this.nesting;i++){
      result = "  " + result;
    }
    return result;
  }

  @Override
  public void visit(FileInfo target) {
    String name = pad(target.getName());
    System.out.println(name);
  }

  @Override
  public void visit(DirectoryInfo target) {
    String name = pad(target.getName()) + "\\";
    System.out.println(name);
    this.nesting+=1;

    for(FileSystemInfo child : target.getContents()){
      child.accept(this);
    }
    this.nesting-=1;
  }
  
}
