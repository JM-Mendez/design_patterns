package TemplateMethodComplete;


public class Appropriation extends Bill {

  public Appropriation(String id) {
    super(id);
  }

  @Override
  public void postCommittee(){
    this.reportProgress("Some other committee debate.");
    this.reportProgress("Some other committee vote.");
  }
  
}
