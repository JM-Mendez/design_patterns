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
		preProposal();
		proposal();
		postProposal();

		preCommittee();
		committee();
		postCommittee();

		preFloor();
		floor();
		postFloor();

		preSignoff();
		signoff();
		postSignoff();
  }

  protected void preProposal(){}
  protected void postProposal(){}
  protected void proposal(){
    this.reportProgress("Proposal");
  }


  protected void preCommittee(){}
  protected void postCommittee(){}
  protected void committee(){
    this.reportProgress("Committee debate");
    this.reportProgress("Committee vote");
  }


  protected void preFloor(){}
  protected void postFloor(){}
  protected void floor(){
    this.reportProgress("Floor debate");
    this.reportProgress("Floor vote");
  }


  protected void preSignoff(){}
  protected void postSignoff(){}
  protected void signoff(){
    this.reportProgress("Executive Signoff");
  }


}
