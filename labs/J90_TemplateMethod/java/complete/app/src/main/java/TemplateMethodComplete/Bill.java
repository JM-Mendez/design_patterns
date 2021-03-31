package TemplateMethodComplete;

public class Bill {
  private String id="";

  public Bill(String id){
    this.id=id;
  }

  public String getID(){
    return this.id;
  }

  protected void reportProgress(String step){
    System.out.print("[");
    System.out.print("Bill: " + this.id);
    System.out.print(", Step: " + step);
    System.out.println("]");
  }

  public void processWorkflow(){
		this.reportProgress("Proposal");
		this.reportProgress("Committee Debate");
		this.reportProgress("Committee Vote");
		this.reportProgress("Floor Debate");
		this.reportProgress("Floor Vote");
		this.reportProgress("Executive Sign-off");
  }

}
