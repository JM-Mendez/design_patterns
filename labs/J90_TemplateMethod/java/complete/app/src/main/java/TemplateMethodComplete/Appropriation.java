package TemplateMethodComplete;

public class Appropriation extends Bill {

  public Appropriation(String id) {
    super(id);
  }

  @Override
  public void processWorkflow(){
    this.reportProgress("Proposal");
		this.reportProgress("Committee Debate");
		this.reportProgress("Committee Vote");

		this.reportProgress("Some other committee Debate");
		this.reportProgress("Some other committee Vote");

		this.reportProgress("Floor Debate");
		this.reportProgress("Floor Vote");
		this.reportProgress("Executive Sign-off");
  }
  
}
