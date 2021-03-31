package TemplateMethodComplete;

public class Resolution extends Bill {

  public Resolution(String id) {
    super(id);
  }
  

  @Override
  public void processWorkflow(){
		this.reportProgress("Proposal");
		this.reportProgress("Committee Debate");
		this.reportProgress("Committee Vote");
		this.reportProgress("Floor Debate");
		this.reportProgress("Floor Vote");
  }

}
