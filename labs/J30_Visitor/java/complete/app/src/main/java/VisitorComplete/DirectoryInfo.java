package VisitorComplete;

import java.util.ArrayList;

public class DirectoryInfo extends FileSystemInfo {
  
  public DirectoryInfo(String name) {
    super(name);
  }

  private ArrayList<FileSystemInfo> contents = new ArrayList<FileSystemInfo>();

  public Iterable<FileSystemInfo> getContents(){
    return this.contents;
  }

  public void addChild(FileSystemInfo child){
    this.contents.add(child);
  }

  @Override
  public void accept(IFileSystemVisitor visitor) {
    visitor.visit(this);    
  }

}

